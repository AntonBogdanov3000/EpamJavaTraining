package by.bogdanov.task6.dao.impl;

import by.bogdanov.task6.dao.OvalDao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileOvalDao implements OvalDao {
    @Override
    public ArrayList<String> getData() {
        FileReader fileReader;
        ArrayList<String> list = new ArrayList<>();
      try{
           fileReader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_Pr06\\src\\main\\resources\\Data");
          BufferedReader bufferedReader = new BufferedReader(fileReader);
          String line = bufferedReader.readLine();
          while(line != null){
              list.add(line);
              line = bufferedReader.readLine();
          }
      }catch (IOException e){
          System.out.println(e.getMessage());
      }finally{
          return list;
      }
    }
}
