// Lab 7 - Intermediate 1: validateAge throws our exception for ages outside 0 to 120
public class AgeValidator {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age " + age + " is not between 0 and 120");
        }
        System.out.println("Age " + age + " is valid");
    }

    public static void main(String[] args) {
        int[] ages = {25, 130, -5, 120};

        for (int age : ages) {
            try {
                validateAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Invalid: " + e.getMessage());
            }
        }
    }
}
