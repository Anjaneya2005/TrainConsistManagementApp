import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UC10Test {

    @Test
    void testReduce_TotalSeatCalculation() {

        List<UC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC10.Bogie("Sleeper", 72));
        bogies.add(new UC10.Bogie("AC Chair", 56));
        bogies.add(new UC10.Bogie("First Class", 24));

        int result = UC10.totalCapacity(bogies);

        assertEquals(152, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {

        List<UC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC10.Bogie("Sleeper", 70));
        bogies.add(new UC10.Bogie("AC Chair", 60));

        int result = UC10.totalCapacity(bogies);

        assertEquals(130, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {

        List<UC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC10.Bogie("Sleeper", 80));

        int result = UC10.totalCapacity(bogies);

        assertEquals(80, result);
    }

    @Test
    void testReduce_EmptyBogieList() {

        List<UC10.Bogie> bogies = new ArrayList<>();

        int result = UC10.totalCapacity(bogies);

        assertEquals(0, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {

        List<UC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC10.Bogie("Sleeper", 50));
        bogies.add(new UC10.Bogie("AC Chair", 40));
        bogies.add(new UC10.Bogie("First Class", 10));

        int result = UC10.totalCapacity(bogies);

        assertEquals(100, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {

        List<UC10.Bogie> bogies = new ArrayList<>();
        bogies.add(new UC10.Bogie("Sleeper", 72));

        UC10.totalCapacity(bogies);

        assertEquals(1, bogies.size());
    }
}