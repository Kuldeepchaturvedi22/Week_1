import java.util.*;
public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static String generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(String[] otps) {
        Set<String> otpSet = new HashSet<>();
        for (String otp : otps) {
            if (!otpSet.add(otp)) {
                return false; // If adding returns false, it means the OTP is already in the set
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Create an array to save the OTP numbers generated 10 times
        String[] otpArray = new String[10];
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs: ");
        for (String otp : otpArray) {
            System.out.println(otp);
        }

        // Validate that the OTPs are unique
        boolean uniqueOTPs = areOTPsUnique(otpArray);
        System.out.println("Are OTPs unique: " + uniqueOTPs);
    }
}
