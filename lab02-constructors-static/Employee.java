// Lab 2 - Intermediate 1: auto id, three constructors and a copy constructor
public class Employee {
    private static int nextId = 1;   // the id the next employee will get

    private int employeeId;
    private String name;
    private double salary;

    // constructor 1: everything given
    public Employee(String name, double salary) {
        this.employeeId = nextId;
        nextId++;
        this.name = name;
        this.salary = salary;
    }

    // constructor 2: only the name, salary starts at 1000
    public Employee(String name) {
        this(name, 1000);
    }

    // constructor 3: nothing given
    public Employee() {
        this("Unknown", 1000);
    }

    // copy constructor: a new employee (new id) with the same name and salary
    public Employee(Employee other) {
        this(other.name, other.salary);
    }

    public void show() {
        System.out.println("Id " + employeeId + ": " + name + ", salary " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Tendai", 2500);
        Employee e2 = new Employee("Chipo");
        Employee e3 = new Employee();
        Employee e4 = new Employee(e1);

        e1.show();
        e2.show();
        e3.show();
        e4.show();
    }
}
