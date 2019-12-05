package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OverloadTest {

    @Test
    public void testPrintType() {
        Overload.printType(null);
        Overload.printType((byte) 34);
        Overload.printType((short) 2);
        Overload.printType(60);
        Overload.printType(60L);
        Overload.printType(12.1f);
        Overload.printType(12.12d);
        Overload.printType(false);
        Overload.printType(new Person());
        Overload.printType(new Point(1,1,1));
        Overload.printType(Integer.valueOf(4));
        Overload.printType("java");
        Overload.printType('n');
    }

}