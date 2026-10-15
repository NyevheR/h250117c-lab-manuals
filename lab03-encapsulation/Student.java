// Lab 3 - Basic 1 and 2: private fields, a checking setter, and getGrade()
public class Student {
    private String name;
    private int marks;      // must stay between 0 and 100

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);    // the constructor uses the same check
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be 0 to 100, but got " + marks);
        }
        this.marks = marks;
    }

    // the grade is worked out from the marks, so we do not store it
    public String getGrade() {
        if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Rudo", 72);
        System.out.println(s.getName() + " has " + s.getMarks() + " marks, grade " + s.getGrade());

        s.setMarks(48);
        System.out.println(s.getName() + " now has " + s.getMarks() + " marks, grade " + s.getGrade());

        try {
            s.setMarks(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
        System.out.println("Marks are still " + s.getMarks());
    }
}
