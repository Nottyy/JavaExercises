package goldDigger.models.discoverer;

public class Archaeologist extends baseDiscoverer {
    private static final int ARCHAEOLOGIST_ENERGY = 60;

    public Archaeologist(String name) {
        super(name, ARCHAEOLOGIST_ENERGY);
    }
}
