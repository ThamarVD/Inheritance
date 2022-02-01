import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker w1;
    @BeforeEach
    void setUp() {
        w1 = new Worker("Roger", "Uncle", "000005", "Mr.", 1999, 12);
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(11);
        assertEquals(11, w1.getHourlyPayRate());
    }
}