package by.bogdanov.task3.controller.impl;

import by.bogdanov.task3.bean.Array;
import by.bogdanov.task3.controller.command.Command;
import by.bogdanov.task3.service.ArrayService;
import by.bogdanov.task3.service.factory.ServiceFactory;

public class ShakeSortCommand implements Command {
    @Override
    public void execute(){
        ServiceFactory serviceFactory = ServiceFactory.getServiceFactory();
        ArrayService arrayService = serviceFactory.getArrayService();
        System.out.println(arrayService.shakeSort(new Array()));
    }
}
