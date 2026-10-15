import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// An EXTRA way to order students: by marks, highest first
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Integer.compare(b.marks, a.marks);
    }
}

// Lab 6 - Intermediate 2
public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tendai", 90));
        list.add(new Student("Anesu", 65));
        list.add(new Student("Chipo", 78));

        Collections.sort(list);                          // uses Comparable (by name)
        System.out.println("By name : " + list);

        Collections.sort(list, new MarksComparator());   // uses the Comparator (by marks)
        System.out.println("By marks: " + list);
    }
}
