package fairyShop.models.interfaces;

import java.util.Collection;

public interface Helper {
    void work();
    boolean canWork();
    void addInstrument(Instrument instrument);
    String getName();
    int getEnergy();
    Collection<Instrument> getInstruments();
}
