package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.bean.Matrix;
import by.bogdanov.task3.service.MatrixService;
import by.bogdanov.task3.service.factory.ServiceFactory;
import by.bogdanov.task3.controller.command.Command;

public class SumOfMatrixCommand implements Command {
    @Override
    public void execute() {
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        MatrixService matrixService = serviceFactory.getMatrixService();
        System.out.println(matrixService.summation(new Matrix(),new Matrix()));
    }
}
