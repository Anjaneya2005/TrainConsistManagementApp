import java.util.regex.*;

public class UC11 {

    // Validate Train ID
    public static boolean validateTrainID(String trainId) {
        String pattern = "TRN-\\d{4}";
        return Pattern.matches(pattern, trainId);
    }

    // Validate Cargo Code
    public static boolean validateCargoCode(String cargoCode) {
        String pattern = "PET-[A-Z]{2}";
        return Pattern.matches(pattern, cargoCode);
    }

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        if (validateTrainID(trainId)) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (validateCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }
    }
}