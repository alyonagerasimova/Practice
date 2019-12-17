package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MatrixTest {

    @Test
    public void testTestToString() {
        Matrix matrix = new Matrix(2,2);
        matrix.setAt(1,1, 1);
        matrix.setAt(1,2, 2);
        matrix.setAt(2,1, 3);
        matrix.setAt(2,2, 4);
        System.out.println(matrix.toString());

    }
}