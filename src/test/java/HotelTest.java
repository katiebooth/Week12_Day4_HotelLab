import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;
    Guest guest1;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    Booking booking;

    @Before
    public void before(){
        bedroom1 = new Bedroom(RoomType.SINGLE, 101, 100);
        bedroom2 = new Bedroom(RoomType.DOUBLE, 102, 200);
        bedroom3 = new Bedroom(RoomType.TRIPLE, 103, 300);
        guest1 = new Guest("Callum");
        conferenceRoom = new ConferenceRoom(50, "Lomond");
        hotel = new Hotel();
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addConferenceRoom(conferenceRoom);
        booking = hotel.bookRoom(bedroom1, 3);
    }

    @Test
    public void hotelHasRooms(){
        assertEquals(3, hotel.getBedrooms().size());
    }

    @Test
    public void hotelHasConferenceRooms(){
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddGuestToRoom(){
        hotel.addGuestToRoom(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuests().size());
    }

    @Test
    public void checkRoomFull(){
        hotel.addGuestToRoom(guest1, bedroom1);
        hotel.addGuestToRoom(guest1, bedroom1);
        assertEquals(2, bedroom1.getGuests().size());
    }

    @Test
    public void canAddBooking(){
        assertEquals(3, booking.getNumberOfNights());
    }
}
