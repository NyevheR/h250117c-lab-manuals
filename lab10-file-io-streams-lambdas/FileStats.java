import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

// Lab 10 - Intermediate 1: count the lines, words and characters of sample.txt
public class FileStats {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("sample.txt"));

            int words = 0;
            int characters = 0;
            for (String line : lines) {
                characters += line.length();
                if (!line.isBlank()) {
                    words += line.trim().split("\\s+").length;
                }
            }

            System.out.println("Lines     : " + lines.size());
            System.out.println("Words     : " + words);
            System.out.println("Characters: " + characters + " (not counting line breaks)");
        } catch (IOException e) {
            System.out.println("Could not read sample.txt: " + e.getMessage());
        }
    }
}
