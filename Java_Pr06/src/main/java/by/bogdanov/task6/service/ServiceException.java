package by.bogdanov.task6.service;

public class ServiceException extends Exception{

    public ServiceException (String message){
        super(message);
    }
    public ServiceException (String message, Exception e){
        super(message,e);
    }
    public ServiceException (Exception e){
        super(e);
    }
}
