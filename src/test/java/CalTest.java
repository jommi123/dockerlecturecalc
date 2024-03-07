import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalTest {
    @Test
    public void testAddMe() {
        Cal cal = new Cal();
        assertEquals(25, cal.addMe(12, 13));
    }

    @Test
    public void testSubMe() {
        Cal cal = new Cal();
        assertEquals(-1, cal.subMe(12, 13));
    }
}
