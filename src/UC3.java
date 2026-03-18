import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for Bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add Bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIDs);
    }
}