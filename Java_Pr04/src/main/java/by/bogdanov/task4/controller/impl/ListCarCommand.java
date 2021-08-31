package by.bogdanov.task4.controller.impl;

import by.bogdanov.task4.bean.Car;
import by.bogdanov.task4.controller.command.Command;
import by.bogdanov.task4.service.CarService;
import by.bogdanov.task4.service.factory.CarServiceFactory;
import by.bogdanov.task4.service.impl.Creator;

public class ListCarCommand implements Command {

    @Override
    public void execute() {
        CarServiceFactory carServiceFactory = CarServiceFactory.getCarFactory();
        CarService carService = carServiceFactory.getService();
        Creator creator = new Creator();
        for (int i=0; i<Creator.carCount;i++){
            creator.addACar();
        }
        for (Car carForPrint : carService.checkMyCars()){
            System.out.println(carForPrint);
        }
    }
}
