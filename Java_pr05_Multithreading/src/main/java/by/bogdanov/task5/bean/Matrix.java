package by.bogdanov.task5.bean;

public class Matrix {

    private int [][] matrix;

    public Matrix(int size){
        this.matrix = new int[size][size];
    }
    public Matrix(){}
    public void setMatrix(int i, int j,int number){
        this.matrix[i][j] = number;
    }

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
}

