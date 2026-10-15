// Lab 8 - Intermediate 1: the same Stack class used for numbers and for text
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        System.out.println("peek: " + numbers.peek());
        System.out.println("pop : " + numbers.pop());
        System.out.println("pop : " + numbers.pop());
        System.out.println("empty? " + numbers.isEmpty());

        Stack<String> words = new Stack<>();
        words.push("one");
        words.push("two");
        System.out.println("word pop: " + words.pop());

        try {
            Stack<String> empty = new Stack<>();
            empty.pop();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
