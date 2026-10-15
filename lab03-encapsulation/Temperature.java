// Lab 3 - Challenge: kelvin is stored privately, callers only use Celsius and Fahrenheit
public class Temperature {
    private double kelvin;      // the hidden internal unit

    public Temperature(double celsius) {
        setCelsius(celsius);
    }

    public void setCelsius(double celsius) {
        double k = celsius + 273.15;
        if (k < 0) {
            throw new IllegalArgumentException("Below absolute zero (-273.15 C) is impossible");
        }
        this.kelvin = k;
    }

    public double getCelsius() {
        return kelvin - 273.15;
    }

    public double getFahrenheit() {
        return getCelsius() * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(25);
        System.out.println("25 C is " + t.getFahrenheit() + " F");

        t.setCelsius(-40);
        System.out.println("-40 C is " + t.getFahrenheit() + " F");

        try {
            t.setCelsius(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
