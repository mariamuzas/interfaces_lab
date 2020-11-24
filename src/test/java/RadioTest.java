import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;
    Stereo stereo;

    @Before
    public void before() {
        radio = new Radio("Roberts", "X54");
        stereo = new Stereo("CodeClan Stereo");
    }

    @Test
    public void canGetMake() {
        assertEquals("Roberts", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("X54", radio.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("Listening to Radio1", radio.tune("Radio1"));
    }

    @Test
    public void canConnect() {
        
        assertEquals("Roberts X54 has connected to CodeClan Stereo", radio.connect(stereo));
    }
    
}
