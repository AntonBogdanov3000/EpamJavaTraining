package by.bogdanov.task3.service;

import by.bogdanov.task3.bean.Matrix;

public interface MatrixService {

    Matrix summation(Matrix a, Matrix b);
    Matrix subtraction(Matrix matrixA, Matrix matrixB);
    Matrix transposition(Matrix matrix);
    Matrix multiplication(Matrix matrixA, Matrix matrixB);
}
