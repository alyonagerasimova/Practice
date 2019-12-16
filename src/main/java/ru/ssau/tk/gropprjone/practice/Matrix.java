package ru.ssau.tk.gropprjone.practice;

public class Matrix {
    private double[][] matrix;
    private final int n;
    private final int m;

    public Matrix() {
        this.n = 0;
        this.m = 0;
    }

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new double[n][m];
    }

    Matrix(double[][] matrix) {
        this.n = matrix.length;
        this.m = matrix[0].length;
        this.matrix = matrix;
    }

    int getN() {
        return n;
    }

    int getColumns() {
        return m;
    }

    public void setAt(int n, int m, double value) {
        matrix[n - 1][m - 1] = value;
    }

    double getAt(int n, int m) {
        return matrix[n - 1][m - 1];
    }

}
