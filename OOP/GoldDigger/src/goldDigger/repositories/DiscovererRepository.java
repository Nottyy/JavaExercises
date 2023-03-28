package goldDigger.repositories;

import goldDigger.models.discoverer.Discoverer;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DiscovererRepository implements Repository{
    private Map<String, Discoverer> discoverers;

    public DiscovererRepository(){
        this.discoverers = new HashMap<>();
    }

    @Override
    public Collection<Discoverer> getCollection() {
        return Collections.unmodifiableCollection(this.discoverers.values());
    }

    @Override
    public void add(Object entity) {
        Discoverer dsc = (Discoverer) entity;
        this.discoverers.put(dsc.getName(), dsc);
    }

    @Override
    public boolean remove(Object entity) {
        Discoverer dsc = (Discoverer) entity;
        return this.discoverers.remove(dsc.getName()) != null;
    }

    @Override
    public Discoverer byName(String name) {
        return this.discoverers.get(name);
    }
}
