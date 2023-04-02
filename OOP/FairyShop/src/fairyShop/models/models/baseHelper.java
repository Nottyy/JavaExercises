package fairyShop.models.models;

import fairyShop.common.ExceptionMessages;
import fairyShop.models.interfaces.Helper;
import fairyShop.models.interfaces.Instrument;

import java.util.ArrayList;
import java.util.Collection;

public abstract class baseHelper implements Helper {
    public final static int BASE_HELPER_INITIAL_ENERGY_DECREASE = 10;
    private String name;
    private int energy;
    private Collection<Instrument> instruments;
    protected int decreaseValue;

    public baseHelper(String name, int energy) {
        this.setName(name);
        this.setEnergy(energy);
        this.instruments = new ArrayList<>();
        this.decreaseValue = BASE_HELPER_INITIAL_ENERGY_DECREASE;
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new NullPointerException(ExceptionMessages.HELPER_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    private void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public Collection<Instrument> getInstruments() {
        return this.instruments;
    }

    @Override
    public void work() {
        int energyAfterWork = this.energy - this.decreaseValue;

        if (energyAfterWork < 0) {
            this.setEnergy(0);
        } else {
            this.setEnergy(energyAfterWork);
        }
    }

    @Override
    public boolean canWork() {
        return this.energy > 0 ? true : false;
    }

    @Override
    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }
}
