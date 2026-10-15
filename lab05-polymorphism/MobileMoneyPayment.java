public class MobileMoneyPayment extends Payment {
    public MobileMoneyPayment(double amount) {
        super(amount);
    }

    @Override
    public void process() {
        System.out.println("Sending mobile money: " + amount);
    }
}
