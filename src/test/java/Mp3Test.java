import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3Test {
    Mp3 mp3;
    Stereo stereo;

    @Before
    public void before() {
        mp3 = new Mp3("Sony", "X54");
        stereo = new Stereo("CodeClan Stereo");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", mp3.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("X54", mp3.getModel());
    }

    @Test
    public void canConnect() {
        assertEquals("Sony X54 has connected to CodeClan Stereo", mp3.connect(stereo));
    }
}
