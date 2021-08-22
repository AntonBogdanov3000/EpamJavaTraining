package by.bogdanov.task3.service.impl;

import by.bogdanov.task3.bean.Matrix;
import by.bogdanov.task3.dao.MatrixDao;
import by.bogdanov.task3.dao.factory.DaoFactory;
import by.bogdanov.task3.exceptions.MatrixException;
import by.bogdanov.task3.service.MatrixService;

public class MatrixServiceImpl implements MatrixService{

    @Override
    public Matrix summation(Matrix a, Matrix b) {
        DaoFactory factory = DaoFactory.getDaoFactory();
        MatrixDao matrixDao = factory.getMatrixDao();
        matrixDao.fillMatrix(a);
        matrixDao.fillMatrix(b);

        System.out.println(a);
        System.out.println(b + "\n");

        Matrix result = new Matrix(a.matrix.length, a.matrix[0].length);

        for(int row = 0; row < a.matrix[0].length; row++){
            for(int col = 0; col < a.matrix.length; col++){
                result.matrix[col][row] = a.matrix[col][row] + b.matrix[col][row];
            }
        }
        return result;
    }

    @Override
    public Matrix subtraction(Matrix matrixA, Matrix matrixB ) {
        DaoFactory factory = DaoFactory.getDaoFactory();
        MatrixDao matrixDao = factory.getMatrixDao();
        matrixDao.fillMatrix(matrixA);
        matrixDao.fillMatrix(matrixB);

        System.out.println(matrixA);
        System.out.println(matrixB + "\n");

        Matrix result = new Matrix(matrixA.matrix.length, matrixB.matrix[0].length);

        for(int row = 0; row < matrixA.matrix[0].length; row++){
            for(int col = 0; col < matrixA.matrix.length; col++){
                result.matrix[col][row] = matrixA.matrix[col][row] - matrixB.matrix[col][row];
            }
        }
        return result;
    }


    @Override
    public Matrix transposition(Matrix matrix) {
        System.out.println(matrix);

        Matrix result = new Matrix();
        result.matrix = new int[matrix.matrix[0].length][matrix.matrix.length];

        for(int i = 0; i < matrix.matrix.length; i++){
            for (int j = 0; j < matrix.matrix[0].length; j++){
                result.matrix[j][i] = matrix.matrix[i][j];
            }
        }
        return result;
    }

    @Override
    public Matrix multiplication(Matrix matrixA, Matrix matrixB) throws MatrixException {
       if(isMatrixForMultiplication(matrixA,matrixB)){
           System.out.println(matrixA);
           System.out.println(matrixB + "\n");}
       else  throw new MatrixException("Incorrect enter");//System.out.println("wrong row size of the second Matrix");
           Matrix result = new Matrix();
           result.matrix = new int[matrixA.matrix.length][matrixB.matrix[0].length];

        for (int i=0; i < matrixA.matrix.length; i++){
            for (int j=0; j < matrixB.matrix[0].length; j++){
                for (int t=0; t < matrixA.matrix[0].length; t++){
                    try {
                        result.matrix[i][j] += matrixA.matrix[i][t] * matrixB.matrix[t][j];
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return result;
    }

    @Override
    public boolean isMatrixForMultiplication(Matrix matrixA, Matrix matrixB) {
        return matrixA.matrix.length == matrixB.matrix[0].length;
    }
    @Override
    public Matrix createMatrix(int columns, int rows) throws MatrixException{
        if(columns <0 || rows < 0){
            throw new MatrixException("Incorrect input data for Matrix creation");
        }
        DaoFactory dao = DaoFactory.getDaoFactory();
        MatrixDao matrixDao = dao.getMatrixDao();
        return matrixDao.fillMatrix(new Matrix(columns, rows));
    }
}
