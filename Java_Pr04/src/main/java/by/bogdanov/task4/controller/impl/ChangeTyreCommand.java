package by.bogdanov.task4.controller.impl;

import by.bogdanov.task4.bean.CarException;
import by.bogdanov.task4.controller.command.Command;
import by.bogdanov.task4.service.CarService;
import by.bogdanov.task4.service.factory.CarServiceFactory;
import by.bogdanov.task4.service.impl.Creator;
import by.bogdanov.task4.viewer.Main;
import java.io.IOException;

public class ChangeTyreCommand implements Command {
    public void execute(){
        CarServiceFactory carServiceFactory = CarServiceFactory.getCarFactory();
        CarService carService = carServiceFactory.getService();
        System.out.println(Main.rb.getString("str9"));
        try{
            if(Creator.list.isEmpty()) {
                throw new CarException("Car list does not create, use the LIST_CAR command");
            }
        }catch (CarException e){
            System.out.println(e.getMessage());
        }
        try{
        String car = Main.reader.readLine();
        for(int i=0; i< Creator.list.size(); i++){
            if(car.equals(Creator.list.get(i).getVehicle())){
                System.out.println(Creator.list.get(i).getVehicle() + carService.changeTyre(Creator.list.get(i)));
            }
        }}catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
