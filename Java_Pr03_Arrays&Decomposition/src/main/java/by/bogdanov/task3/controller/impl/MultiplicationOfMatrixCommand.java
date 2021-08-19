package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.bean.Array;
import by.bogdanov.task3.bean.Matrix;
import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.service.MatrixService;
import by.bogdanov.task3.service.factory.ServiceFactory;

public class MultiplicationOfMatrixCommand implements Command {
    @Override
    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        MatrixService matrixService = serviceFactory.getMatrixService();
        System.out.println(matrixService.multiplication(new Matrix(),new Matrix()));
    }
}
