package restaurant.repositories.models;

import restaurant.entities.drinks.interfaces.Beverages;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BeverageRepository<T> implements restaurant.repositories.interfaces.BeverageRepository {
    private Map<String, T> entities;

    public BeverageRepository() {
        this.entities = new HashMap<>();
    }

    @Override
    public Object beverageByName(String drinkName, String drinkBrand) {
        return null;
    }

    @Override
    public Collection getAllEntities() {
        return Collections.unmodifiableCollection(this.entities.values());
    }

    @Override
    public void add(Object entity) {
        String name = ((Beverages) entity).getName();
        String brand = ((Beverages) entity).getBrand();

        this.entities.put(name + brand, (T) entity);
    }
}
