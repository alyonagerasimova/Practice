package ru.ssau.tk.Practice.Tasks.functions;

class Points {
    public static void main(String[] args) {
        Point point1 = new Point(1.5, 2, 3);
        Point point2 = new Point(14, 0, -3.8);
        Point point3 = new Point(8, -9, 5);
        point1.getInfo();
    }

    static Point sum(Point point1, Point point2) {
        return new Point(point1.x+point2.x, point1.y+point2.y, point1.z+point2.z);
    }

    static Point subtract(Point point3, Point point2) {
        return new Point(point3.x-point2.x, point3.y-point2.y, point3.z-point2.z);
    }

    static Point multiply(Point point3, Point point1) {
        return new Point(point1.x*point3.x, point1.y*point3.y, point1.z*point3.z);
    }

    static Point divide(Point point1, Point point3) {
        return new Point(point1.x/point3.x, point1.y/point3.y, point1.z/point3.z);
    }

    private Points() {

    }

   static Point enlarge(Point point, double a){

        return new Point(point.x*a, point.y*a,point.z*a);
    }

    static double length(Point point){

        return point.length();
    }
    static Point opposite(Point point){
        return new Point(-point.x,-point.y, -point.z);
    }
    static Point inverse(Point point){
        return new Point(1/point.x,1/point.y, 1/point.z);
    }

    static double scalarProduct(Point point1, Point point2){
        return point1.x*point2.x + point1.y*point2.y + point1.z*point2.z;
    }
    static Point vectorProduct(Point point1, Point point2){
        double q;
        double t;
        double p;
        q = point1.y*point2.z - point1.z*point2.y;
        t = -(point1.x*point2.z - point1.z*point2.x);
        p = point1.x*point2.y - point1.y*point2.x;
        return new Point(q,t,p);
    }
}

public class Point {
    final double x;
    final double y;
    final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length () {
        double r=x*x+y*y+z*z;
        return Math.sqrt(r);
    }
    String getInfo() {
        return "(" + x + "; " + y + "; " + z + ")";
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
