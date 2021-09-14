package by.bogdanov.task5.bean;

import by.bogdanov.task5.dao.MatrixDao;
import by.bogdanov.task5.dao.factory.DaoFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Semaphore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MatrixThread implements Runnable{

    Matrix matrix;
    Semaphore semaphore;
    int number;
    static int a = 0;
    static int b = 0;

    public MatrixThread(){}
    public MatrixThread(Matrix matrix, Semaphore semaphore){
        this.matrix = matrix;
        this.semaphore = semaphore;
    }
    public void getNumber(MatrixThread t){
        try {
            t.semaphore.acquire();
            FileReader fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_pr05_Multithreading\\src\\main\\resources\\Threads");
            BufferedReader reader = new BufferedReader(fileReader);
            reader.readLine();
            String [] s = reader.readLine().split(" ");
            this.number = Integer.parseInt(s[a]);
            log.info(Thread.currentThread().getName()+" take a number " + this.number);
            TimeUnit.SECONDS.sleep(2);
            ++a;
            t.semaphore.release();

        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void run (){

        try {
            getNumber(this);
            semaphore.acquire();
            matrix.matrix[b][b] = this.number;
           log.info(Thread.currentThread().getName()+" put "+ this.number);
            TimeUnit.SECONDS.sleep(1);
            semaphore.release();
            b++;
           System.out.println(matrix);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public static Logger log = LogManager.getLogger(MatrixThread.class);


    public static void main(String[] args) throws IOException ,InterruptedException{


        DaoFactory daoFactory = new DaoFactory();
        MatrixDao matrixDao = daoFactory.getMatrixDao();
        Semaphore semaphore = new Semaphore(1);

            MatrixThread matrixThread = new MatrixThread(matrixDao.getMatrix(), semaphore);


            Thread t = new Thread(matrixThread);
            Thread t1 = new Thread(matrixThread);
            Thread t2 = new Thread(matrixThread);
            Thread t3 = new Thread(matrixThread);
            t.start();
            t1.start();
            t2.start();
            t2.join();
            t3.start();
            }
    }

