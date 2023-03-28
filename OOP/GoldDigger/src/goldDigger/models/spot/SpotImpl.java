package goldDigger.models.spot;

import goldDigger.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public class SpotImpl implements Spot {
    private String name;
    private Collection<String> exhibits;

    public SpotImpl(String name) {
        if (name.isEmpty() || name == null) {
            throw new NullPointerException(ExceptionMessages.SPOT_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
        this.exhibits = new ArrayList<String>();
    }

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
