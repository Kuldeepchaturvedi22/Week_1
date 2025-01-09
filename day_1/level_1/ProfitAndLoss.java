// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the ProfitAndLoss class, which will calculate and display the profit and profit percentage based on cost price and selling price
public class ProfitAndLoss { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Defines the cost price of the item
        int costPrice = 129; 
        // Defines the selling price of the item
        int sellingPrice = 191; 
        // Calculates the profit by subtracting cost price from selling price
        int profit = sellingPrice - costPrice; 
        // Calculates the profit percentage
        double profitPercentage = ((double) profit / (double) costPrice) * 100; 
        // Prints the cost price and selling price to the console
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice); 
        // Prints the profit and profit percentage to the console
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage); 
    }
}
