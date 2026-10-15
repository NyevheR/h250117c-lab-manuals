// Lab 6 - Basic 2: Bird and Aeroplane share NO parent class, only the Flyable promise
public class FlyDemo {
    public static void main(String[] args) {
        Flyable[] things = { new Bird(), new Aeroplane() };

        for (Flyable f : things) {
            f.fly();
        }
    }
}
