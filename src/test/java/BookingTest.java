import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;
    Booking booking;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.DOUBLE, 101, 200);
        booking = new Booking(bedroom1, 3);
    }

    @Test
    public void hasNumberOfNightsBooked(){
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(600, booking.getBill());
    }

}
