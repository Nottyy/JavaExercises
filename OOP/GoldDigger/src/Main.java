import goldDigger.models.discoverer.Discoverer;
import goldDigger.models.discoverer.Geologist;
import goldDigger.models.operation.Operation;
import goldDigger.models.operation.OperationImpl;
import goldDigger.models.spot.Spot;
import goldDigger.models.spot.SpotImpl;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Discoverer gosho = new Geologist("Gosho");
        Spot sp = new SpotImpl("Spot");
        sp.getExhibits().add("Ispeto");
        sp.getExhibits().add("gucata");
        sp.getExhibits().add("bako");
        Operation op = new OperationImpl();
        Collection<Discoverer> discoverers = new ArrayList<>();
        discoverers.add(gosho);

        op.startOperation(sp, discoverers);
        //Controller controller = (Controller) new ControllerImpl();
        //Engine engine = new EngineImpl(controller);
        //engine.run();
    }
}
