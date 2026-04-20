import java.util.*;

public class UC19 {

    // Binary Search method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIDs = {
                "BG309",
                "BG101",
                "BG550",
                "BG205",
                "BG412"
        };

        // IMPORTANT: sort before binary search
        Arrays.sort(bogieIDs);

        String searchKey = "BG309";

        boolean found = binarySearch(bogieIDs, searchKey);

        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie NOT Found: " + searchKey);
        }
    }
}