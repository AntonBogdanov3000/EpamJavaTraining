package by.bogdanov.task5.controller.impl;

import by.bogdanov.task5.controller.command.Command;
import by.bogdanov.task5.service.impl.MatrixLockerService;
import by.bogdanov.task5.service.impl.MatrixSemaphoreService;
import java.util.concurrent.locks.ReentrantLock;
import java.io.IOException;


public class LockerCommand implements Command {
    @Override
    public void execute() {
        ReentrantLock locker = new ReentrantLock();
        try {
            MatrixLockerService.MyThread myThread = new MatrixLockerService.MyThread(MatrixSemaphoreService.matrixDao.getMatrix(), locker);
            for (int i=0;i< myThread.getCountOfThreads();i++){
                new Thread(myThread).start();
            }}catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
