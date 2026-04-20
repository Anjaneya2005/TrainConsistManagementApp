import java.util.*;
import java.util.stream.Collectors;

public class UC13 {

    // Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // Loop-based filtering
    public static List<Bogie> filterWithLoop(List<Bogie> bogies, int threshold) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.capacity > threshold) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public static List<Bogie> filterWithStream(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // create large dataset
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        // LOOP timing
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterWithLoop(bogies, 60);
        long endLoop = System.nanoTime();

        // STREAM timing
        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterWithStream(bogies, 60);
        long endStream = System.nanoTime();

        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");

        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());
    }
}