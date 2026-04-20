import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC13Test {

    @Test
    void testLoopFilteringLogic() {

        List<UC13.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC13.Bogie("Sleeper", 72));
        bogies.add(new UC13.Bogie("AC Chair", 50));

        List<UC13.Bogie> result = UC13.filterWithLoop(bogies, 60);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {

        List<UC13.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC13.Bogie("Sleeper", 72));
        bogies.add(new UC13.Bogie("AC Chair", 50));

        List<UC13.Bogie> result = UC13.filterWithStream(bogies, 60);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {

        List<UC13.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC13.Bogie("Sleeper", 72));
        bogies.add(new UC13.Bogie("AC Chair", 50));

        List<UC13.Bogie> loopResult = UC13.filterWithLoop(bogies, 60);
        List<UC13.Bogie> streamResult = UC13.filterWithStream(bogies, 60);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {

        List<UC13.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC13.Bogie("Sleeper", 72));

        long start = System.nanoTime();
        UC13.filterWithLoop(bogies, 60);
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }

    @Test
    void testLargeDatasetProcessing() {

        List<UC13.Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            bogies.add(new UC13.Bogie("Sleeper", i % 100));
        }

        List<UC13.Bogie> result = UC13.filterWithStream(bogies, 60);

        assertTrue(result.size() > 0);
    }
}