// Lab 6 - Challenge: two interfaces give the same default method, so the class MUST choose
public class DefaultConflict implements Hello1, Hello2 {

    @Override
    public void hello() {
        Hello1.super.hello();       // ask Hello1's version
        Hello2.super.hello();       // ask Hello2's version
        System.out.println("Hello from DefaultConflict");
    }

    public static void main(String[] args) {
        new DefaultConflict().hello();
    }
}
