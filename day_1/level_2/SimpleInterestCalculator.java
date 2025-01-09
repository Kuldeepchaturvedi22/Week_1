import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Principal
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        // Input Rate of Interest
        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        // Input Time
        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
    }
}
