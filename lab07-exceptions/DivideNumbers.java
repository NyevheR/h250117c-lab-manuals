import java.util.Scanner;

// Lab 7 - Basic 1: read two whole numbers and divide, without crashing
public class DivideNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("First number: ");
            int a = Integer.parseInt(in.nextLine());

            System.out.print("Second number: ");
            int b = Integer.parseInt(in.nextLine());

            System.out.println(a + " / " + b + " = " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("That is not a whole number. Please type digits only.");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero.");
        }
        System.out.println("Program finished normally.");
    }
}
