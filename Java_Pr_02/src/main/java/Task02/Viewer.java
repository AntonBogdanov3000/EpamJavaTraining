package Task02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Viewer {
    public static Locale locale;
    public static ResourceBundle rb;
    private static final Logger log = LogManager.getLogger(Viewer.class);
    public static void main(String[] args) throws IOException {

        log.info("Start of viewer");

        System.out.println("Enter 1 for : English , Введите 2 для языка : Русский");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("1")){
            locale = new Locale("en","EN");
            rb = ResourceBundle.getBundle("properties.text",locale);
        }
        if(s.equals("2")){
            locale = new Locale("ru","RU");
            rb = ResourceBundle.getBundle("properties.text",locale);
        }
            System.out.println(rb.getString("str1") + "\n");

        System.out.println(rb.getString("str14"));
        String numberOfTask = reader.readLine();
        log.info("User choose task number "+ numberOfTask);

        if(numberOfTask.equals("1")){
            Controller.startCompare();}
        if(numberOfTask.equals("2")){
            Controller.startEnterAdate();}
        if(numberOfTask.equals("3")){
            Controller.startDistanceBetweenPoints();}
        if(numberOfTask.equals("4")){
            Controller.startOfTable();}
        if(numberOfTask.equals("5")){
            Controller.startOfProgression();}
        if(numberOfTask.equals("6")){
            Controller.startCompareToNumber();}
        if(numberOfTask.equals("7")){
            Controller.startOfCalculation();}
        if(numberOfTask.equals("8")){
            Controller.startOfTableForValues();
        }
         log.info("End of Viewer");

    }
}
