// Lab 6 - Basic 1: an abstract class says WHAT a shape must do, not HOW
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

    // a normal method shared by every shape
    public void describe() {
        System.out.printf("%s: area = %.2f, perimeter = %.2f%n",
                getClass().getSimpleName(), area(), perimeter());
    }
}
