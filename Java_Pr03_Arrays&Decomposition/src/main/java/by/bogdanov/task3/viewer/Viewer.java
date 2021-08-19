package by.bogdanov.task3.viewer;

import by.bogdanov.task3.controller.CommandName;
import by.bogdanov.task3.controller.Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Viewer {

   public static Logger log = LogManager.getLogger(Viewer.class);

    public static void main(String[] args) throws IOException {
        log.info("Start of application");
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Controller controller = new Controller();

        while(true) {
            System.out.println("Enter a command ...");
            String s = reader.readLine();
            if(s.equals("EXIT")){
                log.info("Stopped by user");
                break;
            }
            controller.executeTask(s);
        }
    }
}
