// Lab 6 - Intermediate 2: the NATURAL order of a Student is alphabetical by name
public class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}
