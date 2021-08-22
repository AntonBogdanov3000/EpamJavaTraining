package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.exceptions.MatrixException;
import by.bogdanov.task3.service.MatrixService;
import by.bogdanov.task3.service.factory.ServiceFactory;
import by.bogdanov.task3.viewer.Viewer;

import java.io.IOException;

public class TranspositionOfMatrixCommand implements Command {
    @Override
    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        MatrixService matrixService = serviceFactory.getMatrixService();
        try {
            System.out.println("Enter count of rows");
            int row = Integer.parseInt(Viewer.reader.readLine());
            System.out.println("Enter count of columns");
            int column =  Integer.parseInt(Viewer.reader.readLine());
            System.out.println(matrixService.transposition(matrixService.createMatrix(row, column)));
        }catch (IOException | NumberFormatException | MatrixException e){
            System.out.println(e.getMessage());
        }
    }
}
