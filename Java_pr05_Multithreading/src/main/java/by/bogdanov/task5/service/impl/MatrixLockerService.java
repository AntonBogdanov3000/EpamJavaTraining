package by.bogdanov.task5.service.impl;

import by.bogdanov.task5.bean.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class MatrixLockerService {
    public static Logger log = LogManager.getLogger(MatrixLockerService.class);

    public static class MyThread implements Runnable{
        Matrix matrix;
        int number;
        ReentrantLock locker;
        static int countForGetNumber = 0;
        static int countForRun = 0;
        static int countOfThreads;


        public MyThread(Matrix matrix,ReentrantLock locker){
            this.matrix = matrix;
            this.locker = locker;

        }
        public int getCountOfThreads(){
            try{
                FileReader fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_pr05_Multithreading\\src\\main\\resources\\Threads");
                BufferedReader reader = new BufferedReader(fileReader);
                countOfThreads = Integer.parseInt(reader.readLine());
            }catch (IOException e){
                log.debug(e.getMessage());
            }
            finally {
                return countOfThreads;
            }
        }
        public void getNumber(MatrixLockerService.MyThread t){
            try {
                locker.lock();
                FileReader fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_pr05_Multithreading\\src\\main\\resources\\Threads");
                BufferedReader reader = new BufferedReader(fileReader);
                reader.readLine();
                String [] s = reader.readLine().split(" ");
                this.number = Integer.parseInt(s[countForGetNumber]);
                ++countForGetNumber;
                log.info(Thread.currentThread().getName()+" take a number " + this.number);
                TimeUnit.SECONDS.sleep(1);
                locker.unlock();
            }catch (IOException | InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        public void run (){
            try {
                getNumber(this);
                locker.lock();
                matrix.setMatrix(countForRun,countForRun,this.number);
                log.info(Thread.currentThread().getName()+" put "+ this.number);
                locker.unlock();
                ++countForRun;
                TimeUnit.MILLISECONDS.sleep(200);
                System.out.println(matrix);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

