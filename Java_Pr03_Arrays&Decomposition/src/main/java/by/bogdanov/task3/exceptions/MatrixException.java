package by.bogdanov.task3.exceptions;

public class MatrixException extends Exception{

    public MatrixException(){
    }
    public MatrixException(String message, Throwable obj){
        super(message,obj);
    }
    public MatrixException(String message){
        super(message);
    }
    public MatrixException(Throwable obj){
        super(obj);
    }
}
