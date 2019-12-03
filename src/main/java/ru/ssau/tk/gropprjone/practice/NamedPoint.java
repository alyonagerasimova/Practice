package ru.ssau.tk.gropprjone.practice;

public class NamedPoint extends Point implements Resettable {
    private String name;
    public NamedPoint(){
        this(0,0,0,"Origin");
    }
    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

     NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public void reset() {
        name = "Absent";
    }
}
