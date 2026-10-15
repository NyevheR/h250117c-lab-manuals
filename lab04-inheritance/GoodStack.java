import java.util.ArrayList;

// Lab 4 - Challenge (after): a Stack that HAS-A ArrayList inside. Only push/pop/peek are visible.
public class GoodStack {
    private ArrayList<String> items = new ArrayList<>();

    public void push(String item) {
        items.add(item);
    }

    public String pop() {
        return items.remove(items.size() - 1);
    }

    public String peek() {
        return items.get(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public static void main(String[] args) {
        GoodStack stack = new GoodStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // stack.add(0, "SNEAKY");   // would NOT compile: GoodStack has no add method
        System.out.println("pop  -> " + stack.pop());
        System.out.println("peek -> " + stack.peek());
        System.out.println("empty? " + stack.isEmpty());
    }
}
