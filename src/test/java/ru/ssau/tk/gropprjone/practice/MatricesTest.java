package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatricesTest {

    @Test
    public void testSumTwoMatrix() {
        double[][] matrix1 = {{2, 2}, {3, 3}};
        double[][] matrix2 = {{-1, 1}, {-2, 2}};
        Matrix matrixFirst = new Matrix(matrix1);
        Matrix matrixSecond = new Matrix(matrix2);
        Matrix matrixThird = Matrices.sumTwoMatrix(matrixFirst, matrixSecond);
        assertEquals(matrixThird.getAt(1, 1), 1.0);
        assertEquals(matrixThird.getAt(1, 2), 3.0);
        assertEquals(matrixThird.getAt(2, 1), 1.0);
        assertEquals(matrixThird.getAt(2, 2), 5.0);
    }

    @Test
    public void testMultiplicationTwoMatrix() {
        double[][] matrix1 = {{2, 2}, {3, 3}};     // 2 2  -1 1
        double[][] matrix2 = {{-1, 1}, {-2, 2}};   // 3 3  -2 2
        Matrix matrixFirst = new Matrix(matrix1);
        Matrix matrixSecond = new Matrix(matrix2);
        Matrix matrixThird = Matrices.multiplicationTwoMatrix(matrixFirst, matrixSecond);
        assertEquals(matrixThird.getAt(1, 1), -6.0);
        assertEquals(matrixThird.getAt(1, 2), 6.0);
        assertEquals(matrixThird.getAt(2, 1), -9.0);
        assertEquals(matrixThird.getAt(2, 2), 9.0);
    }

    @Test
    public void testMultiplicationMatrixAndNumber() {
        double[][] matrix1 = {{2, 3}, {3, 4}};
        int number = 3;
        Matrix matrixFirst = new Matrix(matrix1);
        Matrix matrixThird = Matrices.multiplicationMatrixAndNumber(matrixFirst, number);
        assertEquals(matrixThird.getAt(1, 1), 6.0);
        assertEquals(matrixThird.getAt(1, 2), 9.0);
        assertEquals(matrixThird.getAt(2, 1), 9.0);
        assertEquals(matrixThird.getAt(2, 2), 12.0);
    }

    @Test
    public void testFindDeterminant() {
        double[][] matrix1 = {{2, 3}, {3, 4}};
        double[][] matrix2 = {{3, 2, 3}, {2, 3, 2}, {1, 1, 2}};
        double[][] matrix3 = {{2}};
        Matrix matrixFirst = new Matrix(matrix1);
        Matrix matrixSecond = new Matrix(matrix2);
        Matrix matrixThree = new Matrix(matrix3);
        assertEquals(Matrices.findDeterminant(matrixFirst), -1.0);
        assertEquals(Matrices.findDeterminant(matrixThree), 2.0);
        assertEquals(Matrices.findDeterminant(matrixSecond), 5.0);
    }
}