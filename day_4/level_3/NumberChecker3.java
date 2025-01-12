public class NumberChecker3 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number ;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits ;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    public static void main(String[] args) {
        int number = 49; // Example number

        boolean prime = isPrime(number);
        System.out.println("Is Prime: " + prime);

        boolean neon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + neon);

        boolean spy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + spy);

        boolean automorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number: " + automorphic);

        boolean buzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + buzz);
    }
}
