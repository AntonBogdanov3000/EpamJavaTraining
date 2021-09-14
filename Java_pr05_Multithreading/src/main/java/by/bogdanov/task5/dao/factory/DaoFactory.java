package by.bogdanov.task5.dao.factory;

import by.bogdanov.task5.dao.MatrixDao;
import by.bogdanov.task5.dao.impl.FileMatrixDao;

public class DaoFactory {

    private static final DaoFactory daofactory = new DaoFactory();
    private final MatrixDao matrixDao = new FileMatrixDao();

    public static DaoFactory getDaoFactory(){
        return daofactory;
    }
    public MatrixDao getMatrixDao(){
       return matrixDao;
    }
}
