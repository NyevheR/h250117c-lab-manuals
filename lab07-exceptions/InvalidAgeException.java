// Lab 7 - Intermediate 1: our own CHECKED exception (it extends Exception)
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
