import java.util.ArrayList;

// Lab 4 - Challenge (before): a Stack that IS-A ArrayList. This is the bad design.
public class BadStack extends ArrayList<String> {
    public void push(String item) {
        add(item);
    }

    public String pop() {
        return remove(size() - 1);
    }

    public static void main(String[] args) {
        BadStack stack = new BadStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Because it IS an ArrayList, outsiders can break the stack rules:
        stack.add(0, "SNEAKY");     // insert at the bottom
        stack.remove(1);            // remove from the middle
        System.out.println("BadStack now holds: " + stack);
    }
}
