package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint point1 = new NamedPoint();
    NamedPoint point2 = new NamedPoint(5,7,9,"Alex");
    NamedPoint point3 = new NamedPoint(4,6,8);

    @Test
    public void testGetName() {
        assertEquals(point1.getName(), "Origin");
        assertEquals(point2.getName(), "Alex");
        assertNull(point3.getName());
    }

    @Test
    public void testSetName() {
        point1.setName("Yulia");
        assertEquals(point1.getName(), "Yulia");
        point2.setName(null);
        assertNull(point2.getName());
        point3.setName("Zendaya");
        assertEquals(point3.getName(), "Zendaya");
    }

}