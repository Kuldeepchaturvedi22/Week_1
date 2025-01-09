import java.util.Scanner;
public class TemperaturConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9/5) + 32;

        // Print the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

    }
}
