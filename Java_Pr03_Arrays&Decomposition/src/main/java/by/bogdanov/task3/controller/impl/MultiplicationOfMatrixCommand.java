package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.exceptions.MatrixException;
import by.bogdanov.task3.service.MatrixService;
import by.bogdanov.task3.service.factory.ServiceFactory;
import by.bogdanov.task3.viewer.Viewer;
import java.io.IOException;

public class MultiplicationOfMatrixCommand implements Command {
    @Override
    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        MatrixService matrixService = serviceFactory.getMatrixService();
        try {
            System.out.println("Enter count of rows of the first Matrix");
            int rowsOfFirst = Integer.parseInt(Viewer.reader.readLine());
            System.out.println("Enter count of columns of the first Matrix");
            int columnsOfFirst = Integer.parseInt(Viewer.reader.readLine());
            System.out.println("Enter count of rows of the second Matrix");
            int rowsOfSecond = Integer.parseInt(Viewer.reader.readLine());
            System.out.println("Enter count of columns of the second Matrix");
            int columnsOfSecond = Integer.parseInt(Viewer.reader.readLine());
            System.out.println(matrixService.multiplication(matrixService.createMatrix(rowsOfFirst,columnsOfFirst),matrixService.createMatrix(rowsOfSecond,columnsOfSecond)));
        }catch (IOException | NumberFormatException | MatrixException e){
            System.out.println(e.getMessage());
        }
    }
}
