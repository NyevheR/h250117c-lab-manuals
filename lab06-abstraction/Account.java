// Lab 6 - Intermediate 1: deposit() is finished, monthlyFee() is left for the subclasses
public abstract class Account {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double monthlyFee();
}
