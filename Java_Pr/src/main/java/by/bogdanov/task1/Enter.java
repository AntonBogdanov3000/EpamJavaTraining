package by.bogdanov.task1;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Enter {
    private static Logger log = LogManager.getLogger(Enter.class);

    public static void main(String[] args) throws IOException {
        log.info("Start");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of task : 1,2,3,4,5 ");

        String s = reader.readLine();
        if(s.equals("1")){
            Main.startOfRadians();
        }else if(s.equals("2")){
            Main.startOfFunction();
        }else if (s.equals("3")){
            Main.startofCircleArea();
        }else if(s.equals("4")){
            Main.startOfTriangle();
        }else if(s.equals("5")){
            Main.startOfFigureArea();
        }else
            System.out.println("Wrong task number");
        log.info("End");
    }

}

