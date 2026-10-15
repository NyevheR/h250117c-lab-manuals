// Lab 1 - Challenge (part 2): a Person has an Address (an object inside an object)
public class Person {
    String name;
    Address address;   // starts as null until we give it an Address

    public static void main(String[] args) {
        Address home = new Address();
        home.street = "12 Main Road";
        home.city = "Harare";

        Person amina = new Person();
        amina.name = "Amina";
        amina.address = home;

        // chained dots: person -> address -> city
        System.out.println(amina.name + " lives in " + amina.address.city);

        Person brian = new Person();
        brian.name = "Brian";          // no address given, so it is null

        if (brian.address == null) {
            System.out.println(brian.name + " has no address (null)");
        }

        // this line would crash, so we catch the error to show what happens
        try {
            System.out.println(brian.address.city);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: address is null, so .city cannot be read");
        }
    }
}
