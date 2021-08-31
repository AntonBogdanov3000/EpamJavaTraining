package by.bogdanov.task4.viewer;


import by.bogdanov.task4.controller.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger log = LogManager.getLogger(Main.class);
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Locale locale;
    public static ResourceBundle rb;

    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        log.info("Start of application");
        System.out.println("Enter 1 for : English , Введите 2 для языка : Русский");
        String lang = reader.readLine();
        if(lang.equals("1")) {
            locale = new Locale("en", "EN");
            rb = ResourceBundle.getBundle("properties.text", locale);
        }
        if(lang.equals("2")){
            locale = new Locale("ru", "RU");
            rb = ResourceBundle.getBundle("properties.text", locale);
        }
        System.out.println(rb.getString("str1"));

        while(true) {
            System.out.println(rb.getString("str2"));
            String s = reader.readLine();

            log.info("Entered command " + s);
            if(s.equals("EXIT")){
                log.info("Stopped by user");
                break;
            }
                controller.executiveTask(s);
        }
    }
}
