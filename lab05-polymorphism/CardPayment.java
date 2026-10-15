public class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void process() {
        System.out.println("Charging card: " + amount);
    }
}
