// Lab 2 - Intermediate 2: two static blocks and two instance blocks
public class InitBlocks {

    static {
        System.out.println("static block 1");
    }

    {
        System.out.println("instance block 1");
    }

    static {
        System.out.println("static block 2");
    }

    {
        System.out.println("instance block 2");
    }

    public InitBlocks() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        new InitBlocks();
        new InitBlocks();
    }
}
