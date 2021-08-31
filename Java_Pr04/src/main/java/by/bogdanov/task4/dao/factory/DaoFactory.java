package by.bogdanov.task4.dao.factory;

import by.bogdanov.task4.dao.CarDao;
import by.bogdanov.task4.dao.impl.FileCarDao;

public class DaoFactory {

    private static final DaoFactory daofactory = new DaoFactory();
    private final CarDao carDao = new FileCarDao();


    private DaoFactory(){}

    public static DaoFactory getDaoFactory(){
        return daofactory;
    }
    public  CarDao getCarDao(){
        return carDao;
    }

}
