// Lab 6 - Intermediate 1
public class AccountDemo {
    public static void main(String[] args) {
        Account[] accounts = { new SavingsAccount(), new CurrentAccount() };

        for (Account a : accounts) {
            a.deposit(500);
            System.out.println(a.getClass().getSimpleName() + ": balance " + a.getBalance()
                    + ", monthly fee " + a.monthlyFee()
                    + ", balance after fee " + (a.getBalance() - a.monthlyFee()));
        }
    }
}
