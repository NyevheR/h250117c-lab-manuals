// Lab 1 - Intermediate 1: Rectangle with area() and perimeter(), find the biggest of 5
public class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle[] list = new Rectangle[5];
        double[] widths  = {2, 5, 10, 6, 3};
        double[] heights = {3, 4, 1, 6, 2};

        // build the 5 rectangles
        for (int i = 0; i < 5; i++) {
            list[i] = new Rectangle();
            list[i].width = widths[i];
            list[i].height = heights[i];
            System.out.println("Rectangle " + (i + 1) + ": " + widths[i] + " x " + heights[i]
                    + "  area=" + list[i].area() + "  perimeter=" + list[i].perimeter());
        }

        // find the one with the largest area
        Rectangle biggest = list[0];
        for (int i = 1; i < 5; i++) {
            if (list[i].area() > biggest.area()) {
                biggest = list[i];
            }
        }
        System.out.println("Largest: " + biggest.width + " x " + biggest.height
                + " (area " + biggest.area() + ")");
    }
}
