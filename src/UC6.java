import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for Bogie → Capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert Bogie Capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display Bogie Capacity Details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Example: Fast Lookup
        System.out.println("\nCapacity of Sleeper bogie: " + bogieCapacity.get("Sleeper"));
    }
}