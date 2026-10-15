// Lab 9 - Basic 2: one line gives constructor, getters, toString, equals and hashCode
record Student(String name, int age) { }

public class RecordDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Tariro", 19);
        Student s2 = new Student("Tariro", 19);
        Student s3 = new Student("Farai", 21);

        System.out.println(s1);                          // toString is made for us
        System.out.println("s1 equals s2? " + s1.equals(s2));   // compares the values
        System.out.println("s1 == s2?     " + (s1 == s2));      // still two different objects
        System.out.println("s1 equals s3? " + s1.equals(s3));
        System.out.println("Name is " + s1.name() + ", age is " + s1.age());   // read a component
    }
}
