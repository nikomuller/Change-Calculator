import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the purchase price (in cents): ");
        int purchasePrice = input.nextInt();
        System.out.print("Please enter the amount tendered (in cents): ");
        int amountTendered = input.nextInt();

        if (amountTendered < purchasePrice) {
            System.out.println("Not enough change was tendered.");
            return;
        }

        int change = amountTendered - purchasePrice;
        int num50EuroCoins = change / 5000;
        change = change % 5000;
        int num20EuroCoins = change / 2000;
        change = change % 2000;
        int num10EuroCoins = change / 1000;
        change = change % 1000;
        int num5EuroCoins = change / 500;
        change = change % 500;
        int num1EuroCoins = change / 100;

        System.out.println("Change: €" + (double) amountTendered / 100 + " - €" + (double) purchasePrice / 100 + " = €" + (double) (amountTendered - purchasePrice) / 100);
        System.out.println("50 Euro coins: " + num50EuroCoins);
        System.out.println("20 Euro coins: " + num20EuroCoins);
        System.out.println("10 Euro coins: " + num10EuroCoins);
        System.out.println("5 Euro coins: " + num5EuroCoins);
        System.out.println("1 Euro coins: " + num1EuroCoins);
    }
}



