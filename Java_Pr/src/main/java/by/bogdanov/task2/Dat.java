package by.bogdanov.task2;

/**
 * define correct of entered data(day & month)
 */

public class Dat {


    public static String enterCorrectDate(int day, int month){
        if (day<=0 || day>31 && month<=0 || month>12)
             return "Incorrect date";
        else return "Correct date";
    }
}
