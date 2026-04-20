import java.util.*;

public class UC18 {

    // Linear Search method
    public static boolean linearSearch(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(key)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIDs = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchKey = "BG309";

        boolean found = linearSearch(bogieIDs, searchKey);

        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie NOT Found: " + searchKey);
        }
    }
}