package by.bogdanov.task3.dao.factory;


import by.bogdanov.task3.dao.MatrixDao;
import by.bogdanov.task3.dao.ArrayDao;
import by.bogdanov.task3.dao.impl.FileMatrixDao;
import by.bogdanov.task3.dao.impl.FileArrayDao;



public class DaoFactory {

    private static final DaoFactory daofactory = new DaoFactory();

    private final MatrixDao matrixdao = new FileMatrixDao();
    private final ArrayDao arraydao = new FileArrayDao();

    private DaoFactory(){}

    public static DaoFactory getDaoFactory(){
        return daofactory;
    }
    public MatrixDao getMatrixDao(){
        return matrixdao;
    }
    public ArrayDao getArrayDao(){
        return arraydao;
    }
}
