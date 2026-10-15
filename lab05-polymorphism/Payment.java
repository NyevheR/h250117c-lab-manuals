// Lab 5 - Challenge: a payment with an amount
public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // used by the polymorphic design (version 2)
    public abstract void process();
}
