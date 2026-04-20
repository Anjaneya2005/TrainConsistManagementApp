import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC14Test {

    @Test
    void testException_ValidCapacityCreation() throws Exception {

        UC14.PassengerBogie bogie =
                new UC14.PassengerBogie("Sleeper", 72);

        assertEquals("Sleeper", bogie.type);
        assertEquals(72, bogie.capacity);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {

        Exception ex = assertThrows(
                UC14.InvalidCapacityException.class,
                () -> new UC14.PassengerBogie("Sleeper", -10)
        );

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {

        Exception ex = assertThrows(
                UC14.InvalidCapacityException.class,
                () -> new UC14.PassengerBogie("AC Chair", 0)
        );

        assertEquals("Capacity must be greater than zero", ex.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {

        UC14.PassengerBogie bogie =
                new UC14.PassengerBogie("First Class", 24);

        assertEquals("First Class", bogie.type);
        assertEquals(24, bogie.capacity);
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {

        UC14.PassengerBogie b1 =
                new UC14.PassengerBogie("Sleeper", 72);

        UC14.PassengerBogie b2 =
                new UC14.PassengerBogie("AC Chair", 56);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}