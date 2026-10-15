// Lab 5 - Challenge: both designs side by side, plus a NEW payment type to compare them
public class PaymentDemo {
    public static void main(String[] args) {
        Payment card = new CardPayment(100);
        Payment mobile = new MobileMoneyPayment(50);

        PaymentProcessorV1 v1 = new PaymentProcessorV1();
        PaymentProcessorV2 v2 = new PaymentProcessorV2();

        v1.pay(card);
        v1.pay(mobile);
        v2.pay(card);
        v2.pay(mobile);

        // A brand-new payment type, added WITHOUT touching either processor:
        Payment cash = new Payment(20) {
            @Override
            public void process() {
                System.out.println("Taking cash: " + amount);
            }
        };
        v1.pay(cash);       // V1 fails: it was never taught about cash
        v2.pay(cash);       // V2 works automatically
    }
}
