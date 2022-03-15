import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TheatreServiceTest {



    @BeforeEach
    void setUp() {
    }

    @Test
    void testBookSeats() {
        TheatreScreen screen = null;
        Reservation r = null;
        TheatreService ts = new TheatreService();
        int[][] row = new int[10][20];
        int temp[] = row[0];
        assertEquals(true, ts.checkAvailability(temp, 0, 15));
    }
    @Test
    void negativeCount(){
        TheatreScreen var1 = new TheatreScreen(10, 20, 3, 1);
        TheatreService var2 = new TheatreService();
        Main var3 = new Main();
        Reservation var4 = new Reservation("R001", -10);
        var2.bookSeats(var1, var4);
        assertEquals("Cannot accept reservation. Invalid Number of people", var4.getErrorMessage());
    }

    @Test
    void maxNumberOfPeople(){
        TheatreScreen var1 = new TheatreScreen(10, 20, 3, 1);
        TheatreService var2 = new TheatreService();
        Main var3 = new Main();
        Reservation var4 = new Reservation("R001", 21);
        var2.bookSeats(var1, var4);
        assertEquals("Cannot accept reservation. Large number of people in reservation.", var4.getErrorMessage());
    }
    @Test
    void houseFull(){
        TheatreScreen var1 = new TheatreScreen(10, 20, 3, 1);
        TheatreService var2 = new TheatreService();
        Main var3 = new Main();

        Reservation var4 = new Reservation("R001", 21);
        var1.setOccupancy(21);
        var1.maximumCapacity = 20;
        var2.bookSeats(var1, var4);

        assertEquals("Cannot Accept Reservation. Housefull.", var4.getErrorMessage());
    }
}

