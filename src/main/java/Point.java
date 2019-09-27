class Points {
    public static void main(String[] args) {
        Point point1 = new Point(1.5, 2, 3);
        Point point2 = new Point(14, 0, -3.8);
        Point point3 = new Point(8, -9, 5);
        point1.getInfo();
    }

    static Point sum(double point1, double point2) {

        return new Point(point1+point2, point1+point2, point1+point2);

    }

    static Point subtract(double point3, double point2) {

        return new Point(point3-point2, point3-point2, point3-point2);

    }

    static Point multiply(double point3, double point1) {

        return new Point(point1*point3, point1*point3, point1*point3);
    }

    static Point divide(double point1, double point3) {

        return new Point(point1/point3, point1/point3, point1/point3);
    }

    private Points() {

    }

   static Point enlarge(Point point, double a){

        return new Point(point.x*a, point.y*a,point.z*a);

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

    void getInfo() {
        System.out.println("(" + x + "; " + y + "; " + z + ")");
    }

}
