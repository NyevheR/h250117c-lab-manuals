// The NEW subclass. Nothing else in the project had to change.
public class Intern extends Employee {
    public Intern(String name) {
        super(name, 500);       // interns get a fixed small allowance
    }

    @Override
    public double calculatePay() {
        return baseSalary;
    }
}
