package goldDigger.repositories;

import goldDigger.models.spot.Spot;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SpotRepository implements Repository{
    private Map<String, Spot> spots;

    public SpotRepository(){
        this.spots = new HashMap<>();
    }
    @Override
    public Collection getCollection() {
        return Collections.unmodifiableCollection(this.spots.values());
    }

    @Override
    public void add(Object entity) {
        Spot sp = (Spot) entity;
        this.spots.put(sp.getName(), sp);
    }

    @Override
    public boolean remove(Object entity) {
        Spot sp = (Spot) entity;
        return this.spots.remove(sp.getName()) != null;
    }

    @Override
    public Object byName(String name) {
        return this.spots.get(name);
    }
}
