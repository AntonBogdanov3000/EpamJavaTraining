package by.bogdanov.task3.bean;

import by.bogdanov.task3.viewer.Viewer;

import java.util.Arrays;

public class Matrix {
    public int [][] matrix;

    @Override
    public String toString(){
        return Arrays.deepToString(matrix);
    }
    @Override
    public boolean equals(Object obj){
        return obj == this;
    }
}
