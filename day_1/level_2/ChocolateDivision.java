import java.util.Scanner;
public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        // Input number of children
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calculate chocolates each child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Print the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " The number of remaining chocolates are " + remainingChocolates);

    }
}
