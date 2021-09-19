package by.bogdanov.task5.controller.impl;

import by.bogdanov.task5.controller.command.Command;
import by.bogdanov.task5.service.impl.MatrixSemaphoreService;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class SemaphoreCommand implements Command {

    @Override
    public void execute() {
        Semaphore semaphore = new Semaphore(1);
        try {
        MatrixSemaphoreService.MyThread myThread = new MatrixSemaphoreService.MyThread(MatrixSemaphoreService.matrixDao.getMatrix(), semaphore);
        for (int i=0;i< myThread.getCountOfThreads();i++){
            new Thread(myThread).start();
        }}catch (IOException e){
            System.out.println(e.getMessage());
        }
  }
}
