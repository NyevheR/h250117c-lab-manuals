import java.util.ArrayList;

// Lab 8 - Basic 1: sum, maximum and reverse of 10 numbers in an ArrayList
public class ListStats {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] values = {14, 7, 32, 5, 21, 40, 9, 18, 26, 3};
        for (int v : values) {
            numbers.add(v);
        }

        int sum = 0;
        int max = numbers.get(0);
        for (int n : numbers) {
            sum += n;
            if (n > max) {
                max = n;
            }
        }

        System.out.println("List    : " + numbers);
        System.out.println("Sum     : " + sum);
        System.out.println("Maximum : " + max);

        System.out.print("Reversed:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(" " + numbers.get(i));
        }
        System.out.println();
    }
}
