package fairyShop.models.interfaces;

import java.util.Collection;

public interface Helper {
    Collection<Instrument> getInstruments();
    String getName();
    int getEnergy();
    void work();
    boolean canWork();
    void addInstrument(Instrument instrument);
}
