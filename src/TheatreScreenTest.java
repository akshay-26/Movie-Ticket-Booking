import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheatreScreenTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getOccupancy() {
        TheatreScreen sc = new TheatreScreen(10,20,3,1);
        assertEquals(0, sc.getOccupancy());
    }

    @Test
    void getSeatingArrangement() {
        TheatreScreen sc1 = new TheatreScreen(10,20, 3, 1);
        assertEquals(10, sc1.getSeatingArrangement().length);
    }

    @Test
    void getSeatGap() {
        TheatreScreen sc1 = new TheatreScreen(10,20, 3, 1);
        assertEquals(3, sc1.getSeatGap());
    }
}