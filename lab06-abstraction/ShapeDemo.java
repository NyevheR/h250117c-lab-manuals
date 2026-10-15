// Lab 6 - Basic 1
public class ShapeDemo {
    public static void main(String[] args) {
        // Shape s = new Shape();     // would NOT compile: Shape is abstract
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6), new Square(3) };

        for (Shape s : shapes) {
            s.describe();
        }
    }
}
