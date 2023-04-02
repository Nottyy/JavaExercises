package fairyShop.repositories;

import java.util.Collection;

public interface Repository<T> {
    void add(T helper);
    boolean remove(T helper);
    T findByName(String name);
    Collection<T> getModels();
}
