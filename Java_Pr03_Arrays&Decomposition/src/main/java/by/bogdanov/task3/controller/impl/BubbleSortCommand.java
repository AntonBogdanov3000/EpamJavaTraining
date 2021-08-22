package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.service.ArrayService;
import by.bogdanov.task3.service.factory.ServiceFactory;
import by.bogdanov.task3.viewer.Viewer;
import java.io.IOException;

public class BubbleSortCommand implements Command {

    @Override
    public void execute(){
    ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
    ArrayService arrayService = serviceFactory.getArrayService();
    try {
        System.out.println("Enter the size of current array");
    System.out.println(arrayService.bubbleSort(arrayService.createArray(Integer.parseInt(Viewer.reader.readLine()))));
    }
    catch (IOException | NumberFormatException e){
        System.out.println(e.getMessage());
    }

    }
}
