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

        double scalar = point1.x*point2.x + point1.y*point2.y + point1.z*point2.z;
        return scalar;

    }
    static Point vectorProduct(Point point1, Point point2){

        double q;
        q = point1.y*point2.z - point1.z*point2.y;
        double t;
        double p;
        t = -(point1.x*point2.z - point1.z*point2.x);
        p = point1.x*point2.y - point1.y*point2.x;

        Point vector = new Point(q,t,p);
        return vector;

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
