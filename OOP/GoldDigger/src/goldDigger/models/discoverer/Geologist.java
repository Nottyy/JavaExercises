package goldDigger.models.discoverer;

public class Geologist extends baseDiscoverer{
    private static final int GEOLOGIST_ENERGY = 100;

    public Geologist(String name){
        super(name, GEOLOGIST_ENERGY);
    }
}
