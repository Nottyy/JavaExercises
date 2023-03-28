package goldDigger.models.discoverer;

public class Anthropologist extends baseDiscoverer{
    private static final int ANTHROPOLOGIST_ENERGY = 40;

    public Anthropologist(String name){
        super(name, ANTHROPOLOGIST_ENERGY);
    }
}
