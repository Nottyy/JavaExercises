package goldDigger.models.discoverer;

import goldDigger.common.ExceptionMessages;
import goldDigger.models.museum.Museum;

public class baseDiscoverer implements Discoverer {
    public static final int DIG_ENERGY = 15;
    private String name;
    private double energy;
    private Museum museum;

    public baseDiscoverer(String name, double energy) {
        if (name.isEmpty() || name == null) {
            throw  new NullPointerException(ExceptionMessages.DISCOVERER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;

        if (energy < 0) {
            throw new IllegalArgumentException(ExceptionMessages.DISCOVERER_ENERGY_LESS_THAN_ZERO);
        }
        this.energy = energy;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getEnergy() {
        return this.energy;
    }

    @Override
    public boolean canDig() {
        return this.energy > 0 ? true : false;
    }

    @Override
    public Museum getMuseum() {
        return this.museum;
    }

    @Override
    public void dig() {
        if (this.energy - DIG_ENERGY > 0) {
            this.energy -= DIG_ENERGY;
        } else {
            this.energy = 0;
        }
    }
}
