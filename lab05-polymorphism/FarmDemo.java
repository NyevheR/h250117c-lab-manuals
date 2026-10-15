// Lab 5 - Basic 2: one array of the parent type holds all three animals
public class FarmDemo {
    public static void main(String[] args) {
        FarmAnimal[] farm = { new Cat(), new Cow(), new Duck() };

        for (FarmAnimal a : farm) {
            // Java picks the right sound() at run time
            System.out.println(a.getClass().getSimpleName() + " says " + a.sound());
        }
    }
}
