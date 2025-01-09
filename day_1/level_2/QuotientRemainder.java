import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

            // Calculate quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Print the results
            System.out.println("The Quotient is "+quotient+" and Remainder is "+remainder+" of two numbers "+number1+" and "+number2);
    }
}
