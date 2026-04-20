import java.util.*;

public class TrainConsistManagement {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static List<Bogie> sortBogies(List<Bogie> bogies) {
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        return bogies;
    }

    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        sortBogies(bogies);

        System.out.println("Sorted Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " - " + b.capacity);
        }
    }
}