import java.util.*;

public class UC17 {

    public static void main(String[] args) {

        String[] bogies = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Built-in sorting
        Arrays.sort(bogies);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}