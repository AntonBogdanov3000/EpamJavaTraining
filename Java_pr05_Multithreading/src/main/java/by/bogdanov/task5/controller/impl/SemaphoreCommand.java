package by.bogdanov.task5.controller.impl;

import by.bogdanov.task5.controller.command.Command;
import by.bogdanov.task5.bean.MatrixThread;
import by.bogdanov.task5.service.factory.ServiceFactory;

public class SemaphoreCommand implements Command {

    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        MatrixThread matrixThread = serviceFactory.getMatrixThread();


    }
}
