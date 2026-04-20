import java.util.*;
import java.util.stream.Collectors;

public class UC9 {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // UC9: Grouping using Streams
    public static Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        Map<String, List<Bogie>> grouped = groupBogies(bogies);

        System.out.println("Grouped Bogies:");
        for (String key : grouped.keySet()) {
            System.out.println(key + " -> ");
            for (Bogie b : grouped.get(key)) {
                System.out.println("   " + b.name + " - " + b.capacity);
            }
        }
    }
}