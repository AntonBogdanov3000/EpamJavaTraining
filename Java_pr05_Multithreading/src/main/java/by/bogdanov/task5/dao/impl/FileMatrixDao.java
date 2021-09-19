package by.bogdanov.task5.dao.impl;

import by.bogdanov.task5.bean.Matrix;
import by.bogdanov.task5.dao.MatrixDao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileMatrixDao implements MatrixDao {
    @Override
    public Matrix getMatrix() throws IOException {
        Matrix matrix;
            FileReader reader = new FileReader("C:\\Users\\Оксана\\Desktop\\JavaTraining\\MyProject\\Java_pr05_Multithreading\\src\\main\\resources\\Data");
            BufferedReader bufferedReader = new BufferedReader(reader);
            int size = Integer.parseInt(bufferedReader.readLine());
            String numbers = bufferedReader.readLine();
            matrix = new Matrix(size);
            int count = 0;
            while (numbers != null){
              for(int i=0; i<size; i++){
                  String[] s = numbers.split(" ");
                  for(int j=0; j<size; j++){
                      matrix.setMatrix(i,j,Integer.parseInt(s[count]));
                      count++;
                  }
                  numbers = bufferedReader.readLine();
                  count = 0;
              }
            }
        return matrix;
    }
}
