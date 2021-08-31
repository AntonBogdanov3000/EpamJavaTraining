package by.bogdanov.task4.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ReaderDao {
    public static Logger log = LogManager.getLogger(ReaderDao.class);

    public static ArrayList<String> readData() {
        ArrayList<String> cars = new ArrayList<>();
        try{
        FileReader fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_Pr04\\src\\main\\resources\\CarList.txt");
        BufferedReader reader1 = new BufferedReader(fileReader);
        String text = reader1.readLine();
        while (text != null) {
            cars.add(text);
            System.out.println();
            text = reader1.readLine();
        }
        }catch (IOException e){
            log.debug(e.getMessage());
        }
        log.info("Count of cars from file: " + cars.size());
        return cars;
    }
}
