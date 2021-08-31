package by.bogdanov.task4.service;

import by.bogdanov.task4.bean.Car;
import java.util.ArrayList;

public interface CarService {

     String startRide(Car car);
     String fillFuel(Car car);
     String chekOil(Car car);
     String engineStart(Car car);
     String changeTyre(Car car);
     String checkPressure(Car car);
     ArrayList<Car> checkMyCars();
}
