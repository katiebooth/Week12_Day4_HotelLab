import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Callum");
    }

    @Test
    public void hasName(){
        assertEquals("Callum", guest.getName());
    }

}
