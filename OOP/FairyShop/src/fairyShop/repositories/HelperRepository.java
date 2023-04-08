package fairyShop.repositories;

import fairyShop.models.interfaces.Helper;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HelperRepository<T> implements Repository<Helper>{
    private Map<String, Helper> helpers;

    public HelperRepository(){
        this.helpers = new HashMap<>();
    }

    @Override
    public void add(Helper helper) {
        if (this.helpers.containsKey(((Helper) helper).getName()) == false){
            this.helpers.put(((Helper) helper).getName(), (Helper) helper);
        }
    }

    @Override
    public boolean remove(Helper helper) {
        return this.helpers.remove(((Helper) helper).getName(), helper);
    }

    @Override
    public Helper findByName(String name) {
        return this.helpers.get(name);
    }

    @Override
    public Collection<Helper> getModels() {
        return Collections.unmodifiableCollection(this.helpers.values());
    }
}
