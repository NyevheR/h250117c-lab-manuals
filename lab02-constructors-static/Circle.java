// Lab 2 - Basic 1 and 2: constructors with a default radius, plus a static counter
public class Circle {
    private static int count = 0;   // one shared counter for all circles
    private double radius;

    // constructor 1: the caller gives the radius
    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    // constructor 2: no radius given, so use 1.0
    public Circle() {
        this(1.0);
    }

    public static int getCount() {
        return count;
    }

    public double area() {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(2.5);
        Circle c2 = new Circle();

        System.out.println("c1 area = " + c1.area());
        System.out.println("c2 area = " + c2.area());
        System.out.println("Circles created: " + Circle.getCount());
    }
}
