// Lab 7 - Basic 2: reading an array position that may not exist
public class ArrayAccess {

    static int getElement(int[] data, int index) {
        try {
            return data[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  Index " + index + " does not exist (valid: 0 to " + (data.length - 1) + ")");
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("Element 1 = " + getElement(numbers, 1));
        System.out.println("Element 7 = " + getElement(numbers, 7));
    }
}
