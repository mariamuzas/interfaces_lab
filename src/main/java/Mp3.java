public class Mp3 extends Component implements IConnect{
    public Mp3(String make, String model) {
        super(make, model);
    }

    public String connect(Stereo stereo) {
        return getMake() + " " + getModel() + " has connected" + " to " + stereo.getName();
    }
}
