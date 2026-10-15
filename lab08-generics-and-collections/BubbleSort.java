import java.util.Arrays;

// Lab 8 - Challenge: one bubble sort that works for any type that can be compared
public class BubbleSort {

    // <T extends Comparable<T>> means: T must have compareTo()
    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {     // out of order? swap
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};
        String[] words = {"pear", "apple", "mango", "banana"};

        bubbleSort(numbers);
        bubbleSort(words);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));

        // int[] plain = {3, 1, 2};
        // bubbleSort(plain);       // would NOT compile: T must be a class, and int is a primitive
    }
}
