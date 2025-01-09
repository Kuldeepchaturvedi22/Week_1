import java.util.Scanner;

public class TemperaturConversionF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5/9;

        // Print the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
    }
}
