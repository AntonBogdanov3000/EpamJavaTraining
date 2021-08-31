package by.bogdanov.task4.bean;

public class CarException extends Exception{

    public CarException(){}
    public CarException(String message, Throwable obj){
        super(message,obj);
    }
    public CarException(String message){
      super(message);
    }
    public CarException(Throwable obj){
      super(obj);
    }
}
