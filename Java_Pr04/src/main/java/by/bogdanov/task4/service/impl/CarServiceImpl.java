package by.bogdanov.task4.service.impl;

import by.bogdanov.task4.bean.Car;
import by.bogdanov.task4.dao.CarDao;
import by.bogdanov.task4.dao.factory.DaoFactory;
import by.bogdanov.task4.service.CarService;
import by.bogdanov.task4.viewer.Main;
import java.util.ArrayList;


public class CarServiceImpl implements CarService {

    @Override
    public ArrayList<Car> checkMyCars(){
        DaoFactory daoFactory = DaoFactory.getDaoFactory();
        CarDao carDao = daoFactory.getCarDao();
        return carDao.enterCarInfo(Creator.list);
    }

    @Override
    public String startRide(Car car) {
        return Main.rb.getString("str8");
    }

    @Override
    public String fillFuel(Car car) {
        return Main.rb.getString("str7");
    }

    @Override
    public String chekOil(Car car) {
        return Main.rb.getString("str3");
    }

    @Override
    public String engineStart(Car car) {
        return Main.rb.getString("str4");
    }

    @Override
    public String changeTyre(Car car) {
        return Main.rb.getString("str5");
    }

    @Override
    public String checkPressure(Car car) {
        return Main.rb.getString("str6");
    }
}

