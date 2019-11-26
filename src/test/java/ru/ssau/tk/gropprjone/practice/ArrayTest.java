package ru.ssau.tk.gropprjone.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    private final double ACCURACY = 0.00001;

    @Test
    public void testWorkThisArray() {
        int[] arr = Array.workThisArray(2);
        assertEquals(arr.length, 2);
    }

    @Test
    public void testGeneration() {
        int count = 7;
        int[] array = Array.generation(count);
        assertEquals(array[0], 2);
        assertEquals(array[count - 1], 2);
        for (int i = 1; i < count - 1; i++) {
            assertEquals(array[i], 1);
        }
    }

    @Test
    public void testOddNum() {
        int count = 8;
        int[] array = Array.oddNum(count);
        for (int i = 0; i < count; i++) {
            assertEquals(array[i], 2 * i + 1);
        }
    }

    @Test
    public void testEvenNum() {
        int count = 9;
        int[] array = Array.evenNum(count);
        for (int i = 0; i < count; i++) {
            assertEquals(array[i], 2 * (count - i));
        }
    }

    @Test
    public void testFibonacci() {
        int count = 5;
        int[] array = Array.fibonacci(count);
        assertEquals(array[count - 1], 5);
    }

    @Test
    public void testSquare() {
        int count = 10;
        int[] array = Array.square(count);
        for (int i = 0; i < count; i++) {
            assertEquals(array[i], i * i);
        }
    }

    @Test
    public void testSolution() {
        double[] x = Array.solution(1, 2, 1);
        assertEquals(x[0], -1, ACCURACY);
        double[] x1 = Array.solution(1,6,5);
        assertEquals(x1[0],-1, ACCURACY );
        assertEquals(x1[1],-5, ACCURACY );
        double[] x2 = Array.solution(0,6,12);
        assertEquals(x2[0], -2., ACCURACY);
    }

    @Test
    public void testNatural() {
        int[] array = Array.natural(4);
        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
        assertEquals(array[2], 4);
        assertEquals(array[3], 5);
    }

    @Test
    public void testArithmeticProgression() {
        double[] array = Array.arithmeticProgression(5, 1.1, 3.9);
        assertEquals(array[1], 5.);
        assertEquals(array[2], 8.9);
        assertEquals(array[3], 12.8);
        assertEquals(array[4], 16.7);
    }

    @Test
    public void testGeometricProgression() {
        double[] array = Array.geometricProgression(5, 1.1, 2);
        assertEquals(array[1], 2.2);
        assertEquals(array[2], 4.4);
        assertEquals(array[3], 8.8);
        assertEquals(array[4], 17.6);
    }

    @Test
    public void testArrayContainNumber() {
        Number[] array = new Number[]{12,3,4,5};
        assertTrue(Array.arrayContainNumber(array,3));
        assertTrue(Array.arrayContainNumber(array,12));
        assertTrue(Array.arrayContainNumber(array,5));
    }

    @Test
    public void testArrayIsNull() {
        Integer[] array = new Integer[]{12, 3, 4, 5, null};
        assertTrue(Array.arrayIsNull(array));
    }
}