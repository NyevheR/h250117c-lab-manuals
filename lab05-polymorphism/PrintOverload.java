// Lab 5 - Basic 1: one method name, four parameter types (overloading)
public class PrintOverload {
    static void print(int n) {
        System.out.println("int: " + n);
    }

    static void print(double d) {
        System.out.println("double: " + d);
    }

    static void print(String s) {
        System.out.println("String: " + s);
    }

    static void print(int[] numbers) {
        System.out.print("int array:");
        for (int n : numbers) {
            System.out.print(" " + n);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(7);
        print(2.5);
        print("hello");
        print(new int[]{4, 5, 6});
    }
}
