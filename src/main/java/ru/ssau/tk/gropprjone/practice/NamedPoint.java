package ru.ssau.tk.gropprjone.practice;

public class NamedPoint extends Point {
    private String name;
    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
    }
}
