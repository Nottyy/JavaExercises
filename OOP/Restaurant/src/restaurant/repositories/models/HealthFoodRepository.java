package restaurant.repositories.models;

import restaurant.entities.healthyFoods.interfaces.HealthyFood;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HealthFoodRepository<T> implements restaurant.repositories.interfaces.HealthFoodRepository {
    private Map<String, T> entities;

    public HealthFoodRepository() {
        this.entities = new HashMap<>();
    }

    @Override
    public Object foodByName(String name) {
        return this.entities.get(name);
    }

    @Override
    public Collection getAllEntities() {
        return Collections.unmodifiableCollection(this.entities.values());
    }

    @Override
    public void add(Object entity) {
        this.entities.put(((HealthyFood) entity).getName(), (T) entity);
    }
}
