import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Lab 3 - Intermediate 1: a bank account that remembers its transactions.
// (BankAccount.java from the manual is kept unchanged, so this is a separate class.)
public class BankAccountWithHistory {
    private double balance;
    private final List<String> history = new ArrayList<>();

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
        history.add("Deposited " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            history.add("Failed withdrawal of " + amount);
            return false;
        }
        balance -= amount;
        history.add("Withdrew " + amount);
        return true;
    }

    public double getBalance() {
        return balance;
    }

    // give back a COPY, wrapped so it cannot be changed
    public List<String> getHistory() {
        return Collections.unmodifiableList(new ArrayList<>(history));
    }

    public static void main(String[] args) {
        BankAccountWithHistory acc = new BankAccountWithHistory();
        acc.deposit(500);
        acc.withdraw(120);
        acc.withdraw(9000);

        System.out.println("Balance: " + acc.getBalance());
        for (String line : acc.getHistory()) {
            System.out.println(" - " + line);
        }

        try {
            acc.getHistory().add("Hacked: deposited 1000000");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot edit the history from outside");
        }
        System.out.println("History size is still " + acc.getHistory().size());
    }
}
