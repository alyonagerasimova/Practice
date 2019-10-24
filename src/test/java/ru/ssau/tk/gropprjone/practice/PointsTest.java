package ru.ssau.tk.gropprjone.practice;

import org.testng.annotations.Test;
import org.testng.Assert;

public class PointsTest {

    public static double delta = 0.00001;

    private boolean equalsApproximately(double a, double b) {
        if (Math.abs(a - b) > delta) {
            return false;
        }
        return true;
    }

    private boolean equalsApproximately(Point point1, Point point2) {
        if (equalsApproximately(point1.x, point2.x) &&
                equalsApproximately(point1.y, point2.y) &&
                equalsApproximately(point1.z, point2.z)) {
            return true;
        }
        return false;
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testSum() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(-1.01, 2.7, 3.9);
        Point point3 = Points.sum(point1, point2);
        Assert.assertTrue(equalsApproximately(point3.x, -0.01));
        Assert.assertTrue(equalsApproximately(point3.y, 4.7));
        Assert.assertTrue(equalsApproximately(point3.z, 6.9));
        Assert.assertFalse(equalsApproximately(point3.x, -0.01002));
        Assert.assertFalse(equalsApproximately(point3.y, 4.70002));
        Assert.assertFalse(equalsApproximately(point3.z, 6.90002));
    }

    @Test
    public void testSubtract() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(-1.01, 2.7, 3.9);
        Point point3 = Points.subtract(point1, point2);
        double b = point3.y;
        Assert.assertTrue(equalsApproximately(b, -0.7));
        Assert.assertTrue(equalsApproximately(point3.x, 2.01));
        Assert.assertTrue(equalsApproximately(point3.z, -0.9));
    }

    @Test
    public void testMultiply() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(-1.01, 2.7, 3.9);
        Point point3 = Points.multiply(point1, point2);
        double b = point3.z;
        Assert.assertTrue(equalsApproximately(b, 11.7));
        Assert.assertTrue(equalsApproximately(point3.x, -1.01));
        Assert.assertTrue(equalsApproximately(point3.y, 5.4));
    }

    @Test
    public void testDivide() {
        Point point1 = new Point(3, 16, 25);
        Point point2 = new Point(-3, 4, -5);
        Point point3 = Points.divide(point1, point2);
        Assert.assertTrue(equalsApproximately(point3.x, -1));
        Assert.assertTrue(equalsApproximately(point3.y, 4));
        Assert.assertTrue(equalsApproximately(point3.z, -5));
    }

    @Test
    public void testEnlarge() {
        Point point1 = new Point(2, 4, 6);
        double a = 1.5;
        Point point2 = Points.enlarge(point1, a);
        Assert.assertTrue(equalsApproximately(point2.x, 3));
        Assert.assertTrue(equalsApproximately(point2.y, 6));
        Assert.assertTrue(equalsApproximately(point2.z, 9));
    }

    @Test
    public void testLength() {
        Point point = new Point(3, 6, 9);
        double len = Points.length(point);
        Assert.assertTrue(equalsApproximately(len, 11.22497));
    }

    @Test
    public void testOpposite() {
        Point point1 = new Point(10, 20, 30);
        Point point2 = Points.opposite(point1);
        Assert.assertTrue(equalsApproximately(point2.x, -10));
        Assert.assertTrue(equalsApproximately(point2.y, -20));
        Assert.assertTrue(equalsApproximately(point2.z, -30));
    }

    @Test
    public void testInverse() {
        Point point1 = new Point(1, 2, 5);
        Point point2 = Points.inverse(point1);
        Assert.assertTrue(equalsApproximately(point2.x, 1));
        Assert.assertTrue(equalsApproximately(point2.y, 0.5));
        Assert.assertTrue(equalsApproximately(point2.z, 0.2));
    }

    @Test
    public void testScalarProduct() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(2, 3, 4);
        double scalar = Points.scalarProduct(point1, point2);
        Assert.assertTrue(equalsApproximately(scalar, 20));
        Assert.assertFalse(equalsApproximately(scalar, 20.0001));
    }

    @Test
    public void testVectorProduct() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(2, 3, 4);
        Point point3 = Points.vectorProduct(point1, point2);
        Assert.assertTrue(equalsApproximately(point3.x, -1));
        Assert.assertTrue(equalsApproximately(point3.y, 2));
        Assert.assertTrue(equalsApproximately(point3.z, -1));
        Assert.assertFalse(equalsApproximately(point3.x, -1.0001));
        Assert.assertFalse(equalsApproximately(point3.y, 2.0001));
        Assert.assertFalse(equalsApproximately(point3.z, -1.0001));
    }
}