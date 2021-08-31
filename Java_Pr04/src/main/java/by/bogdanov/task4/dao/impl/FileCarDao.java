package by.bogdanov.task4.dao.impl;

import by.bogdanov.task4.bean.Car;
import by.bogdanov.task4.dao.CarDao;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileCarDao implements CarDao {

    public static Logger log = LogManager.getLogger(FileCarDao.class);
    @Override
    public ArrayList<Car> enterCarInfo(ArrayList<Car> car) {
        log.info("enterCarInfo method start");

    ArrayList<String> listOfCars = ReaderDao.readData();
    for (int i=0; i < car.size(); i++){
            String[] carPart = listOfCars.get(i).split(" ", 6);
            car.get(i).setManufacturer(carPart[0]);
            car.get(i).setModel(carPart[1]);
            car.get(i).engine.setTypeFuel(carPart[2]);
            car.get(i).engine.setMaxPower(Integer.parseInt(carPart[3]));
            car.get(i).wheel.setManufacturer(carPart[4]);
            car.get(i).wheel.setSize(Integer.parseInt(carPart[5]));
        }
    return car;
    }
}



