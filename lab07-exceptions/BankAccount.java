// Lab 7 - Intermediate 2: withdraw now THROWS instead of returning false.
// It uses InsufficientFundsException exactly as written in the manual.
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Cannot withdraw " + amount + "; balance is " + balance, amount - balance);
        }
        balance -= amount;
    }
}
