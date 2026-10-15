// Lab 9 - Challenge: each Coin constant carries its value in cents
public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // Fewest coins: always take as many of the biggest coin as possible, then the next, and so on
    public static int fewestCoins(int cents) {
        Coin[] all = Coin.values();
        int total = 0;
        for (int i = all.length - 1; i >= 0; i--) {      // biggest first
            int howMany = cents / all[i].value;
            cents = cents % all[i].value;
            if (howMany > 0) {
                System.out.println("  " + howMany + " x " + all[i]);
                total += howMany;
            }
        }
        return total;
    }
}
