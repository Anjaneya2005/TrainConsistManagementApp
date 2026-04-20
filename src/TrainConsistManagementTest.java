import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementTest {

    @Test
    void testSortingBogies() {

        List<TrainConsistManagement.Bogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagement.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagement.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagement.Bogie("First Class", 24));

        List<TrainConsistManagement.Bogie> sorted =
                TrainConsistManagement.sortBogies(bogies);

        assertEquals(24, sorted.get(0).capacity);
        assertEquals(56, sorted.get(1).capacity);
        assertEquals(72, sorted.get(2).capacity);
    }
}