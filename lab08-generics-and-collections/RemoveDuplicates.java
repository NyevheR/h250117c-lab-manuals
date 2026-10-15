import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Lab 8 - Basic 2: a Set never keeps duplicates
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tino");
        names.add("Ada");
        names.add("Tino");
        names.add("Kuda");
        names.add("Ada");
        names.add("Rudo");

        // LinkedHashSet removes repeats AND keeps the original order
        Set<String> unique = new LinkedHashSet<>(names);

        System.out.println("With duplicates   : " + names);
        System.out.println("Without duplicates: " + unique);
    }
}
