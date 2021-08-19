package by.bogdanov.task3.dao.impl;
import by.bogdanov.task3.bean.Matrix;
import by.bogdanov.task3.dao.MatrixDao;

public class FileMatrixDao implements MatrixDao{

    @Override
    public Matrix fillMatrix(Matrix matrix) {
        matrix.matrix = new int[3][5];
        for(int i = 0; i < matrix.matrix.length; i++){
            for(int j = 0; j < matrix.matrix[0].length; j++){
                matrix.matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }
}
