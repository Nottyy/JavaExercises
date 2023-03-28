import goldDigger.core.ControllerImpl;
import goldDigger.core.Controller;
import goldDigger.core.Engine;
import goldDigger.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
//        Discoverer gosho = new Geologist("Gosho");
//        Spot sp = new SpotImpl("Spot");
//        sp.getExhibits().add("Ispeto");
//        sp.getExhibits().add("gucata");
//        sp.getExhibits().add("bako");
//        Operation op = new OperationImpl();
//        Collection<Discoverer> discoverers = new ArrayList<>();
//        discoverers.add(gosho);
//
//        op.startOperation(sp, discoverers);

        Controller controller = (Controller) new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
