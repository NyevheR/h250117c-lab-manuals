import java.util.Iterator;

// Lab 9 - Intermediate 2: our own list built from Nodes, usable in a for-each loop
public class LinkedList implements Iterable<String> {

    // static nested class: a Node does not need a LinkedList object to exist
    private static class Node {
        String value;
        Node next;

        Node(String value) {
            this.value = value;
        }
    }

    private Node head;

    public void add(String value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    // inner class: it needs the list's 'head', so it belongs to a LinkedList object
    private class ListIterator implements Iterator<String> {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }

        public String next() {
            String value = current.value;
            current = current.next;
            return value;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new ListIterator();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("red");
        list.add("green");
        list.add("blue");

        for (String colour : list) {        // works because of Iterable
            System.out.println(colour);
        }
    }
}
