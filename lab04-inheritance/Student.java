// Lab 4 - Basic 1: a Student IS-A Person who also has a course
public class Student extends Person {
    private String course;

    public Student(String name, int age, String course) {
        super(name, age);       // build the Person part first
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}
