package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.exceptions.MatrixException;
import by.bogdanov.task3.service.MatrixService;
import by.bogdanov.task3.service.factory.ServiceFactory;
import by.bogdanov.task3.viewer.Viewer;
import java.io.IOException;

public class SubtractionOfMatrixCommand implements Command {
    @Override
    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        MatrixService matrixService = serviceFactory.getMatrixService();
        try {
            System.out.println("Enter count of rows of the Matrix");
            int rows = Integer.parseInt(Viewer.reader.readLine());
            System.out.println("Enter count of columns of the Matrix");
            int columns = Integer.parseInt(Viewer.reader.readLine());
            System.out.println(matrixService.subtraction(matrixService.createMatrix(rows,columns), matrixService.createMatrix(rows,columns)));
        }catch (NumberFormatException | IOException | MatrixException e){
            System.out.println(e.getMessage());
        }
    }
}
