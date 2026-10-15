// Lab 4 - Intermediate 2: why "class Dog extends Animal" can fail to compile.
//
// This version FAILS:
//     public class Dog extends Animal {
//         public Dog() { }          // Java adds super(); but Animal has no Animal()
//     }
//     error: constructor Animal in class Animal cannot be applied to given types
//
// This version WORKS: we call the parent constructor ourselves with super(name).
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        System.out.println("Dog created with name " + d.name);
    }
}
