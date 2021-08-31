package by.bogdanov.task4.service.impl;

import by.bogdanov.task4.bean.Car;
import by.bogdanov.task4.dao.impl.ReaderDao;

import java.util.ArrayList;

public class Creator {

    public static ArrayList<Car> list = new ArrayList<>();
    public static int carCount = ReaderDao.readData().size();

    public Car carCreator(){
        return new Car(new Car.Engine(), new Car.Wheel());
    }
    public void addACar(){
        list.add(carCreator());
    }
}
