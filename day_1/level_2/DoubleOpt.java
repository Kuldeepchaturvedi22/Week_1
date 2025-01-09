import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        // Double operations
        double result1 = a + b * c; // Multiplication has higher precedence than addition
        double result2 = a * b + c; // Multiplication has higher precedence than addition
        double result3 = c + a / b; // Division has higher precedence than addition
        double result4 = a % b + c; // Modulus has higher precedence than addition

        // Print results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
