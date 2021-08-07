package by.bogdanov.Task02;

/**
 * define correct of entered data(day & month)
 */

public class Dat {


    public static String enterCorrectDate(int day, int month){
        if (day<=0 || day>31 && month<=0 || month>12)
             return Viewer.rb.getString("str15");
        else return Viewer.rb.getString("str16");
    }
}
