// Lab 5 - Challenge, version 1: the processor checks the type itself with instanceof
public class PaymentProcessorV1 {
    public void pay(Payment p) {
        if (p instanceof CardPayment card) {
            System.out.println("V1 charging card: " + card.amount);
        } else if (p instanceof MobileMoneyPayment mobile) {
            System.out.println("V1 sending mobile money: " + mobile.amount);
        } else {
            System.out.println("V1 does not know this payment type!");
        }
    }
}
