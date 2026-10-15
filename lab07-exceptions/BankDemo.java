// Lab 7 - Intermediate 2
public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);

        try {
            acc.withdraw(30);
            System.out.println("Withdrew 30, balance is " + acc.getBalance());

            acc.withdraw(500);      // too much: throws
            System.out.println("This line is never reached");
        } catch (InsufficientFundsException e) {
            System.out.println("Failed: " + e.getMessage());
            System.out.println("You are short by " + e.getShortfall());
        }
        System.out.println("Balance is still " + acc.getBalance());
    }
}
