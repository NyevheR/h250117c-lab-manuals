// Lab 9 - Challenge
public class CoinDemo {
    public static void main(String[] args) {
        int[] amounts = {68, 41, 99};
        for (int amount : amounts) {
            System.out.println(amount + " cents:");
            int coins = Coin.fewestCoins(amount);
            System.out.println("  = " + coins + " coins");
        }
    }
}
