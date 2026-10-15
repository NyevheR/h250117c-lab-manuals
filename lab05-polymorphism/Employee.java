// Lab 5 - Intermediate 1: the Lab 4 style employee hierarchy (kept short)
public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return baseSalary;
    }
}
