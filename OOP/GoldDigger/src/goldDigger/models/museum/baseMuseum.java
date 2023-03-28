package goldDigger.models.museum;

import java.util.ArrayList;
import java.util.Collection;

public class baseMuseum implements Museum{
    private Collection<String> exhibits;

    public baseMuseum(){
        this.exhibits = new ArrayList<>();
    }
    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }
}
