import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scanner.nextDouble();
        
        // Convert height from centimeters to meters
        double heightM = heightCm / 100;
        
        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);
        
        // Determine the weight status based on the BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Print the BMI value and weight status
        System.out.println("Your BMI is " + bmi);
        System.out.println("Your weight status is " + status);
        
        // Close the scanner
        scanner.close();
    }
}
