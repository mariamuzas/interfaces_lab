import java.util.ArrayList;


public class CDPlayer extends Component {

    private ArrayList<String> cdCollection;

    public CDPlayer(String make, String model){
        super(make, model);
        this.cdCollection = new ArrayList<String>();
    }


}
