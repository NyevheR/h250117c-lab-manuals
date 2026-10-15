// Lab 2 - Challenge: private constructor plus static factory methods
public class Temperature {
    private double celsius;

    // private: nobody outside can call "new Temperature(...)"
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    // the method names say what the number means
    public static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    public static Temperature fromFahrenheit(double f) {
        return new Temperature((f - 32) * 5 / 9);
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Temperature a = Temperature.fromCelsius(100);
        Temperature b = Temperature.fromFahrenheit(32);

        System.out.println("100 C = " + a.getFahrenheit() + " F");
        System.out.println("32 F  = " + b.getCelsius() + " C");
    }
}
