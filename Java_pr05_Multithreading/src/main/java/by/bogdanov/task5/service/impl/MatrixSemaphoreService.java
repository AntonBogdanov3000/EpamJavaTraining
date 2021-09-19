package by.bogdanov.task5.service.impl;

import by.bogdanov.task5.bean.Matrix;
import by.bogdanov.task5.dao.MatrixDao;
import by.bogdanov.task5.dao.factory.DaoFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class MatrixSemaphoreService {
    public static Logger log = LogManager.getLogger(MatrixSemaphoreService.class);
    public static DaoFactory daoFactory = DaoFactory.getDaoFactory();
    public static MatrixDao matrixDao = daoFactory.getMatrixDao();

    public static class MyThread implements Runnable{
        Matrix matrix;
        Semaphore semaphore;
        int number;
        static int countForGetNumber = 0;
        static int countForRun = 0;
        static int countOfThreads;


        public MyThread(Matrix matrix,Semaphore semaphore){
            this.matrix = matrix;
            this.semaphore = semaphore;
        }
        public int getCountOfThreads(){
            try{
                FileReader fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_pr05_Multithreading\\src\\main\\resources\\Threads");
                BufferedReader reader = new BufferedReader(fileReader);
                countOfThreads = Integer.parseInt(reader.readLine());
            }catch (IOException e){}
            finally {
                return countOfThreads;
            }
        }
        public void getNumber(MyThread t){
            try {
                t.semaphore.acquire();
                FileReader fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_pr05_Multithreading\\src\\main\\resources\\Threads");
                BufferedReader reader = new BufferedReader(fileReader);
                reader.readLine();
                String [] s = reader.readLine().split(" ");
                this.number = Integer.parseInt(s[countForGetNumber]);
                log.info(Thread.currentThread().getName()+" take a number " + this.number);
                TimeUnit.SECONDS.sleep(1);
                ++countForGetNumber;
                t.semaphore.release();
            }catch (IOException | InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        public void run (){
            try {
                getNumber(this);
                semaphore.acquire();
                matrix.setMatrix(countForRun,countForRun,this.number);
                log.info(Thread.currentThread().getName()+" put "+ this.number);
                semaphore.release();
                ++countForRun;
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println(matrix);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
