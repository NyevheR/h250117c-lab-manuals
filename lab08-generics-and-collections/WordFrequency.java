import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Lab 8 - Intermediate 2: count words with a Map, then show the most frequent first
public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "The cat saw the dog. The dog saw the bird, and the bird saw a cat.";

        // 1. lower case, remove punctuation, split into words
        String clean = paragraph.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = clean.split(" ");

        // 2. count each word (TreeMap keeps equal counts in alphabetical order)
        Map<String, Integer> counts = new TreeMap<>();
        for (String w : words) {
            counts.put(w, counts.getOrDefault(w, 0) + 1);
        }

        // 3. copy the entries to a list and sort it by count, biggest first
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(counts.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
