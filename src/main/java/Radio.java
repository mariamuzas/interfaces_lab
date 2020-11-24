
public class Radio extends Component implements IConnect{

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune(String radioStation) {
        return "Listening to " + radioStation;
    }

    public String connect(Stereo stereo) {
        return getMake() + " " + getModel() + " has connected" + " to " + stereo.getName();
    }
}

