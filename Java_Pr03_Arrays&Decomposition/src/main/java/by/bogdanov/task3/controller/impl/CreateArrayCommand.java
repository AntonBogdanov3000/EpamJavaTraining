package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.service.ArrayService;
import by.bogdanov.task3.service.factory.ServiceFactory;
import by.bogdanov.task3.viewer.Viewer;

import java.io.IOException;

public class CreateArrayCommand implements Command {
    @Override
    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        ArrayService arrayService = serviceFactory.getArrayService();
        try{
        arrayService.createArray(Integer.parseInt(Viewer.reader.readLine()));}
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
