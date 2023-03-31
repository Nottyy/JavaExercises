package restaurant.repositories.models;

import restaurant.entities.tables.interfaces.Table;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TableRepository<T> implements restaurant.repositories.interfaces.TableRepository {
    private Map<Integer, T> entities;

    public TableRepository(){
        this.entities = new HashMap<>();
    }

    @Override
    public Collection getAllEntities() {
        return Collections.unmodifiableCollection(this.entities.values());
    }

    @Override
    public void add(Object entity) {
        this.entities.put(((Table) entity).getTableNumber(), (T)entity);
    }

    @Override
    public Object byNumber(int number) {
        return this.entities.get(number);
    }
}
