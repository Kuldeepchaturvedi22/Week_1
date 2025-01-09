import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        // Input values
        System.out.println("Enter value for a: ");
        int a = sc.nextInt();
        System.out.println("Enter value for b: ");
        int b = sc.nextInt();
        System.out.println("Enter value for c: ");
        int c = sc.nextInt();
		
        // Integer operations
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        int result2 = a * b + c; // Multiplication has higher precedence than addition
        int result3 = c + a / b; // Division has higher precedence than addition
        int result4 = a % b + c; // Modulus has higher precedence than addition

        // Print results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", result1, result2, result3, result4);

    }
}
