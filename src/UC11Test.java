import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC11Test {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(UC11.validateTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(UC11.validateTrainID("TRAIN12"));
        assertFalse(UC11.validateTrainID("TRN12A"));
        assertFalse(UC11.validateTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(UC11.validateCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(UC11.validateCargoCode("PET-ab"));
        assertFalse(UC11.validateCargoCode("PET123"));
        assertFalse(UC11.validateCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(UC11.validateTrainID("TRN-123"));
        assertFalse(UC11.validateTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(UC11.validateCargoCode("PET-aB"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(UC11.validateTrainID(""));
        assertFalse(UC11.validateCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(UC11.validateTrainID("TRN-1234X"));
        assertFalse(UC11.validateCargoCode("PET-ABC"));
    }
}