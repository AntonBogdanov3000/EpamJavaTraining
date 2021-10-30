package by.bogdanov.task7.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    FileReader reader;

    public String read() throws IOException{
            String text = null;
            reader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_Pr07_Composite_Chain_of_Responsibility\\src\\main\\resources\\Text");
            StringBuilder stringBuilder = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((text = bufferedReader.readLine()) != null){
                stringBuilder.append(text);
            }
            return stringBuilder.toString();
    }
}

