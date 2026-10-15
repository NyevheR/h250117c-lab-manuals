import java.util.List;

// Lab 10 - Intermediate 2: names of students above the class average, A to Z
record Student(String name, double mark) { }

public class AboveAverage {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Tendai", 58),
            new Student("Amina", 81),
            new Student("Zawadi", 74),
            new Student("Brian", 49),
            new Student("Mary", 77));

        double average = students.stream()
                .mapToDouble(Student::mark)
                .average()
                .orElse(0);
        System.out.println("Class average: " + average);

        System.out.println("Above average:");
        students.stream()
                .filter(s -> s.mark() > average)       // keep only the good ones
                .map(Student::name)                    // we only want the names
                .sorted()                              // alphabetical
                .forEach(name -> System.out.println("  " + name));
    }
}
