import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(50,"Lomond");
    }

    @Test
    public void hasName(){
        assertEquals("Lomond", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getRoomCapacity());
    }
}
