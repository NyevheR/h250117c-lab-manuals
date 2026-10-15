// Lab 3 - Intermediate 2: an object that can never change after it is built
public final class ImmutablePerson {        // final class: nobody can extend it and break the rules
    private final String name;              // final fields: set once in the constructor only
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {               // getters only, no setters
        return name;
    }

    public int getAge() {
        return age;
    }

    // to "change" the age we build a NEW person and leave the old one alone
    public ImmutablePerson withAge(int newAge) {
        return new ImmutablePerson(name, newAge);
    }

    public static void main(String[] args) {
        ImmutablePerson p1 = new ImmutablePerson("Tino", 20);
        ImmutablePerson p2 = p1.withAge(21);

        System.out.println("p1: " + p1.getName() + ", " + p1.getAge());
        System.out.println("p2: " + p2.getName() + ", " + p2.getAge());
    }
}
