// Lab 4 - Basic 1 and 2: Student and Teacher both use Person's display()
public class PersonDemo {
    public static void main(String[] args) {
        Student s = new Student("Tariro", 19, "Computer Science");
        Teacher t = new Teacher("Mr Moyo", 41, "Mathematics");

        s.display();
        System.out.println("  Course: " + s.getCourse());

        t.display();
        System.out.println("  Subject: " + t.getSubject());

        System.out.println("Student is a Person? " + (s instanceof Person));
        System.out.println("Teacher is a Person? " + (t instanceof Person));
    }
}
