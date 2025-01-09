import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

    }
}
