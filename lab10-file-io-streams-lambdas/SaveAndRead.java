import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Lab 10 - Basic 1: save 5 typed lines to notes.txt, then read them back
public class SaveAndRead {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Type line " + i + ": ");
            lines.add(in.nextLine());
        }

        Path file = Path.of("notes.txt");
        try {
            Files.write(file, lines);                    // save
            System.out.println("Saved to notes.txt");

            List<String> back = Files.readAllLines(file);    // read back
            System.out.println("Reading it back:");
            for (String line : back) {
                System.out.println("  > " + line);
            }
        } catch (IOException e) {
            System.out.println("File problem: " + e.getMessage());
        }
    }
}
