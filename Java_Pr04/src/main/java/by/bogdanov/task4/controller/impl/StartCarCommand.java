package by.bogdanov.task4.controller.impl;

import by.bogdanov.task4.bean.CarException;
import by.bogdanov.task4.controller.command.Command;
import by.bogdanov.task4.service.CarService;
import by.bogdanov.task4.service.factory.CarServiceFactory;
import by.bogdanov.task4.service.impl.Creator;

public class StartCarCommand implements Command {
    public void execute(){
        CarServiceFactory carServiceFactory = CarServiceFactory.getCarFactory();
        CarService carService = carServiceFactory.getService();
        try{
            if(Creator.list.isEmpty()) {
                throw new CarException("Car list does not create, use the LIST_CAR command");
            }
        }catch (CarException e){
            System.out.println(e.getMessage());
        }
        for (int i=0; i< Creator.list.size(); i++){
            System.out.println(Creator.list.get(i).getVehicle() + carService.engineStart(Creator.list.get(i)));
            System.out.println(Creator.list.get(i).getVehicle() + carService.startRide(Creator.list.get(i)));
        }
    }
}
