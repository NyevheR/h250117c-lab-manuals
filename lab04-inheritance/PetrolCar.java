// Lab 4 - Intermediate 1 (level 2 of 3). Named PetrolCar because the manual's
// CompositionDemo.java already contains a class called Car.
public class PetrolCar extends Vehicle {
    public PetrolCar() {
        // Java secretly puts super(); here, so Vehicle() runs first
        System.out.println("2. PetrolCar constructor");
    }
}
