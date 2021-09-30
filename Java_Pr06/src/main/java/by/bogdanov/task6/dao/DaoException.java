package by.bogdanov.task6.dao;

public class DaoException extends Exception{

    public DaoException (String message){
        super(message);
    }
    public DaoException (String message, Exception e){
        super(message, e);
    }
    public  DaoException (Exception e){
        super(e);
    }
}
