import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    SalaryWorker sw1;

    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("Roger", "Uncle", "000005", "Mr.", 1999, 0, 100000);
    }

    @Test
    void setAnnualSalary() {
        sw1.setAnnualSalary(100);
        assertEquals(100, sw1.getAnnualSalary());
    }
}