// Lab 7 - Challenge: does finally run when there is a return inside try?
public class FinallyDemo {

    static int first() {
        try {
            return 1;
        } finally {
            System.out.println("first(): finally runs BEFORE the method really returns");
        }
    }

    static int second() {
        int x = 1;
        try {
            return x;               // the value 1 is remembered here
        } finally {
            x = 99;                 // changing x now is too late to change the answer
            System.out.println("second(): finally changed x to " + x);
        }
    }

    public static void main(String[] args) {
        System.out.println("first() returned " + first());
        System.out.println("second() returned " + second());
    }
}
