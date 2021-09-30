package by.bogdanov.task6.dao.factory;

import by.bogdanov.task6.dao.impl.FileOvalDao;
import by.bogdanov.task6.dao.OvalDao;

public class DaoFactory {

    private static final DaoFactory daofactory = new DaoFactory();
    private final OvalDao ovalDao = new FileOvalDao();

    public static DaoFactory getDaoFactory(){
        return daofactory;
    }
    public by.bogdanov.task6.dao.OvalDao getOvalDao(){
        return ovalDao;
    }
}
