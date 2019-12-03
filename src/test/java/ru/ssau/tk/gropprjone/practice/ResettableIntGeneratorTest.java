package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {

    private IntGenerator generator = new ResettableIntGenerator();
    private int i = generator.nextInt();

    @Test
    public void testNextInt() {
        i = generator.nextInt();
        assertEquals(i, 1);
    }

    @Test
    public void testReset() {
        i = generator.nextInt();
        ((Resettable) generator).reset();
        i = generator.nextInt();
        assertEquals(i, 0);
    }
}