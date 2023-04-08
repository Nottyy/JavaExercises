package fairyShop.repositories;

import fairyShop.models.interfaces.Present;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PresentRepository<T> implements Repository<Present>{
    private Map<String, Present> presents;

    public PresentRepository(){
        this.presents = new HashMap<>();
    }

    @Override
    public void add(Present model) {
        if (this.presents.containsKey(model.getName()) == false){
            this.presents.put(((Present) model).getName(), model);
        }
    }

    @Override
    public boolean remove(Present model) {
        return this.presents.remove(((Present) model).getName(), (Present) model);
    }

    @Override
    public Present findByName(String name) {
        return this.presents.get(name);
    }

    @Override
    public Collection<Present> getModels() {
        return Collections.unmodifiableCollection(this.presents.values());
    }
}
