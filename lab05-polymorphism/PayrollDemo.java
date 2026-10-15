// Lab 5 - Intermediate 1: the payroll loop never mentions Manager, Developer or Intern
public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] staff = {
            new Employee("Kudzai", 2000),
            new Manager("Nyasha", 3500, 800),
            new Developer("Tatenda", 3000, 10),
            new Intern("Chipo")
        };

        double total = 0;
        for (Employee e : staff) {              // this loop is NOT changed when Intern is added
            System.out.println(e.getName() + " earns " + e.calculatePay());
            total += e.calculatePay();
        }
        System.out.println("Total payroll: " + total);
    }
}
