// Lab 1 - Basic 1 and 2: a Car class with display() and isAntique()
public class Car {
    String brand;
    int year;
    double mileage;

    void display() {
        System.out.println(brand + ", year " + year + ", " + mileage + " km");
    }

    // A car is antique when it is MORE than 25 years old (we use 2026 as "this year")
    boolean isAntique() {
        int age = 2026 - year;
        return age > 25;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 2018;
        car1.mileage = 85000;

        Car car2 = new Car();
        car2.brand = "Mazda";
        car2.year = 2005;
        car2.mileage = 190500;

        Car car3 = new Car();
        car3.brand = "Ford";
        car3.year = 1975;
        car3.mileage = 240000;

        car1.display();
        System.out.println("Antique? " + car1.isAntique());
        car2.display();
        System.out.println("Antique? " + car2.isAntique());
        car3.display();
        System.out.println("Antique? " + car3.isAntique());
    }
}
