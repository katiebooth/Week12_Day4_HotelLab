import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 101, 100);
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getRoomCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(100, bedroom.getNightlyRate());
    }

}
