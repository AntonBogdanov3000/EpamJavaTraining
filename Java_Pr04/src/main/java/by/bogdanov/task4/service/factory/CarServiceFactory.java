package by.bogdanov.task4.service.factory;

import by.bogdanov.task4.service.CarService;
import by.bogdanov.task4.service.impl.CarServiceImpl;

public class CarServiceFactory {

    private static final CarServiceFactory carFactory = new CarServiceFactory();
    private final CarService service = new CarServiceImpl();

    CarServiceFactory(){}

    public static CarServiceFactory getCarFactory(){
        return carFactory;
    }
    public CarService getService(){
        return service;
    }
}
