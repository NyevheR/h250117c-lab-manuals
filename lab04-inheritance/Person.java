// Lab 4 - Basic 1 and 2: the parent class
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // written once here, inherited by Student and Teacher
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
