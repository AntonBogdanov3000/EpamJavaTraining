package by.bogdanov.task3.service;

import by.bogdanov.task3.bean.Matrix;
import by.bogdanov.task3.exceptions.MatrixException;

public interface MatrixService {

    Matrix summation(Matrix a, Matrix b);
    Matrix subtraction(Matrix matrixA, Matrix matrixB);
    Matrix transposition(Matrix matrix);
    Matrix multiplication(Matrix matrixA, Matrix matrixB) throws MatrixException;
    Matrix createMatrix(int columns, int rows) throws MatrixException;
    boolean isMatrixForMultiplication(Matrix matrixA, Matrix matrixB);
}
