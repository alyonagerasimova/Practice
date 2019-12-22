package ru.ssau.tk.gropprjone.practice;

public class Matrices {

    private static boolean isComparable(Matrix matrix1, Matrix matrix2) {
        int rows1 = matrix1.getN();
        int columns1 = matrix1.getM();
        int rows2 = matrix2.getN();
        int columns2 = matrix2.getM();
        if (rows1 != rows2 || columns1 != columns2) {
            return false;
        }
        return true;
    }

    static Matrix sumTwoMatrix(Matrix matrix1, Matrix matrix2) {
        int rows1 = matrix1.getN();
        int columns1 = matrix1.getM();
        if (isComparable(matrix1, matrix2)) {
            Matrix matrix3 = new Matrix(rows1, columns1);
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns1; j++) {
                    matrix3.setAt(i + 1, j + 1, matrix1.getAt(i + 1, j + 1) + matrix2.getAt(i + 1, j + 1));
                }
            }
            return matrix3;
        }
        return null;
    }

    static Matrix multiplicationTwoMatrix(Matrix matrix1, Matrix matrix2) {
        int rows1 = matrix1.getN();
        int columns1 = matrix1.getM();
        int columns2 = matrix2.getM();
        if (isComparable(matrix1, matrix2)) {
            Matrix matrix3 = new Matrix(rows1, columns1);
            for (int i = 0; i < rows1; i++) {
                for (int k = 0; k < columns2; k++) {
                    for (int j = 0; j < columns1; j++) {
                        matrix3.setAt(i + 1, k + 1, matrix3.getAt(i + 1, k + 1) +
                                matrix1.getAt(i + 1, j + 1) * matrix2.getAt(j + 1, k + 1));
                    }
                }
            }
            return matrix3;
        }
        return null;
    }

    static Matrix multiplicationMatrixAndNumber(Matrix matrix1, int number) {
        int rows1 = matrix1.getN();
        int columns1 = matrix1.getM();
        Matrix matrix3 = new Matrix(rows1, columns1);
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix3.setAt(i + 1, j + 1, matrix1.getAt(i + 1, j + 1) * number);
            }
        }
        return matrix3;
    }

    public static Double findDeterminant(Matrix matrix) {
        if (matrix.getM() == matrix.getN())
            return recursionFindDet(matrix);
        else return null;
    }

    private static double recursionFindDet(Matrix matrix) {
        int rows = matrix.getN();
        if (rows == 1) {
            // Возвращаем само число
            return matrix.getAt(1, 1);
        } else if (rows == 2) {
            // по упрощенной схеме - крест-накрес в случае 2*2
            return matrix.getAt(1, 1) * matrix.getAt(2, 2) - matrix.getAt(1, 2) * matrix.getAt(2, 1);
        } else {
            double result = 0;
            Matrix minor = new Matrix(rows - 1, rows - 1);
            for (int i = 1; i <= rows; i++) {
                for (int j = 2; j <= rows; j++) {
                    System.arraycopy(matrix.getColumn(j), 0, minor.getColumn(j - 1), 0, i - 1);
                    System.arraycopy(matrix.getColumn(j), i, minor.getColumn(j - 1), i - 1, rows - (i));
                }
                result += Math.pow(-1, i - 1) * matrix.getAt(1, i) * recursionFindDet(minor);
            }
            return result;
        }
    }
}

