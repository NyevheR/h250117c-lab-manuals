import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

// Lab 10 - Challenge: load learners.csv, group by grade band, write one report file per band.
// Learner and StudentRepository come from the manual's Program 10.2 (unchanged).
public class GroupLearners {

    static String band(double gpa) {
        if (gpa >= 3.5) {
            return "A";
        } else if (gpa >= 3.0) {
            return "B";
        } else {
            return "C";
        }
    }

    public static void main(String[] args) throws IOException {
        StudentRepository repo = new StudentRepository("learners.csv");

        // make sure learners.csv has some data (this also uses the manual's saveAll)
        repo.saveAll(List.of(
            new Learner("Ada", 1, 3.9),
            new Learner("Kuda", 2, 3.2),
            new Learner("Farai", 3, 2.4),
            new Learner("Rudo", 4, 3.6),
            new Learner("Tariro", 5, 3.0),
            new Learner("Neo", 6, 2.8),
            new Learner("Zodwa", 7, 3.55)));

        List<Learner> learners = repo.loadAll();

        // group: band letter -> list of learners in that band
        Map<String, List<Learner>> bands = learners.stream()
                .collect(Collectors.groupingBy(l -> band(l.gpa()), TreeMap::new, Collectors.toList()));

        for (String letter : bands.keySet()) {
            List<String> lines = bands.get(letter).stream()
                    .map(Learner::toCsv)
                    .toList();
            Files.write(Path.of("report-" + letter + ".txt"), lines);
            System.out.println("report-" + letter + ".txt (" + lines.size() + " learners):");
            lines.forEach(line -> System.out.println("  " + line));
        }
    }
}
