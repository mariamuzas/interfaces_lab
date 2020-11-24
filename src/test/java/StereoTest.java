import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;

    @Before
    public void before() {
        stereo = new Stereo("CodeClan Stereo");
        radio = new Radio("Roberts", "X54");
        cdPlayer = new CDPlayer("Sony", "9");
    }

    @Test
    public void canGetName(){
        assertEquals("CodeClan Stereo", stereo.getName());
    }

    @Test
    public void checkDevicesIsEmpty() {
        assertEquals(0, stereo.getDevices());
    }

    @Test
    public void canAddDevice() {
        stereo.add(radio);
        stereo.add(cdPlayer);
        assertEquals(2, stereo.getDevices());
    }
}
