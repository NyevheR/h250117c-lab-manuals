import java.util.HashSet;
import java.util.Set;

// Lab 9 - Intermediate 1: a HashSet rejects a second book with the same ISBN
public class BookDemo {
    public static void main(String[] args) {
        Set<Book> shelf = new HashSet<>();

        System.out.println("add Java Basics (111): " + shelf.add(new Book("111", "Java Basics")));
        System.out.println("add Data Structures (222): " + shelf.add(new Book("222", "Data Structures")));
        System.out.println("add Java Basics again (111): " + shelf.add(new Book("111", "Java Basics")));

        System.out.println("Books on shelf: " + shelf.size());
    }
}
