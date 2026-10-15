import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Lab 10 - Basic 2: a Predicate answers true/false, removeIf deletes everything it says true to
public class RemoveEvens {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Before: " + numbers);

        Predicate<Integer> isEven = n -> n % 2 == 0;     // lambda: "n goes to n % 2 == 0"
        numbers.removeIf(isEven);

        System.out.println("After : " + numbers);
    }
}
