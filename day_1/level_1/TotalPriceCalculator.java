import java.util.*;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the unit price of the item
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = sc.nextDouble();

        // Input the quantity to be bought
        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Print the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
