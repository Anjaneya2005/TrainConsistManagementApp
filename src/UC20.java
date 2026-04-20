import java.util.*;

public class UC20 {

    // Search method with validation
    public static boolean searchBogie(String[] arr, String key) {

        // Fail-fast check
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear Search (can also use binary if sorted)
        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIDs = {}; // empty case

        try {
            boolean found = searchBogie(bogieIDs, "BG101");
            System.out.println("Found: " + found);

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // valid case
        String[] validIDs = {"BG101","BG205","BG309"};

        boolean result = searchBogie(validIDs, "BG205");
        System.out.println("Bogie Found: " + result);
    }
}