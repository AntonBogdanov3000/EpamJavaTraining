package by.bogdanov.Task02;

public class TableOfFunctionValues {

    public static void Function(){
        for(double i= -5.0;i<=5.0;i+=0.5){
          double y = 5 - (i*i)/2;
            System.out.println(i +" |  value "+y);
        }
    }
}