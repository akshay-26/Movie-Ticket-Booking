import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getID() {
        Reservation reservation = new Reservation("R001", 10);
        assertEquals("R001", reservation.getID());
    }

    @Test
    void getNoOfPeople() {
        Reservation reservation = new Reservation("R002", 14);
        assertEquals(14, reservation.getNoOfPeople());
    }

    @Test
    void getErrorMessage() {
        Reservation reservation = new Reservation("R001", 21);
        TheatreScreen var1 = new TheatreScreen(10, 20, 3, 1);
        TheatreService var2 = new TheatreService();
        Main var3 = new Main();
       // Reservation var4 = new Reservation("R001", 21);
        var2.bookSeats(var1, reservation);
        assertEquals("Cannot accept reservation. Large number of people in reservation.", reservation.getErrorMessage());
    }
}