package by.bogdanov.task3.bean;

import java.util.Arrays;

public class Matrix {
    public int [][] matrix;

    public Matrix(int row, int column){
        this.matrix = new int[row][column];
    }
    public Matrix(){}

    @Override
    public String toString(){
        String s  = "";
        for(int i=0;i<this.matrix.length;i++){
            for (int j=0;j<this.matrix[0].length;j++){
                s += " " + this.matrix[i][j];
            }
            s += "\n";
        }
        return s;
    }
    @Override
    public boolean equals(Object obj){
        return obj == this;
    }
}
