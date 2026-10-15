// Lab 1 - Intermediate 2: what happens when two variables share one object?
public class RectangleAlias {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 5;

        Rectangle r2 = r1;      // r2 is NOT a copy: it points to the same Rectangle
        r2.width = 20;          // change it through r2 ...

        System.out.println("r1.width = " + r1.width);   // ... and r1 sees the change
        System.out.println("Same object? " + (r1 == r2));
    }
}
