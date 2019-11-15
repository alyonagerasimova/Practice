package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {


    @Test
    public void testWorkThisArray() {
        int[] arr = Array.workThisArray(5);
        assertEquals(arr.length, 5);
    }

    @Test
    public void testGeneration() {
        int count = 5;
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
        int count = 8;
        int[] array = Array.evenNum(count);
        for (int i = 0; i < count; i++) {
            assertEquals(array[i], 2 * (count - i));
        }
    }

    @Test
    public void testFibonacci() {
        int count = 5;
        int[] array = Array.fibonacci(count);
        assertEquals(array[count-1],5);
    }

    @Test
    public void testSquare() {
        int count = 10;
        int[] array = Array.square(count);
        for(int i = 0; i < count; i++) {
            assertEquals(array[i], i * i);
        }
    }
}