import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "9");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("9", cdPlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("I'm playing", cdPlayer.play());
    }
}
