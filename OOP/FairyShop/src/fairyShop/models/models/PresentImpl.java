package fairyShop.models.models;

import fairyShop.common.ExceptionMessages;
import fairyShop.models.interfaces.Present;

public class PresentImpl implements Present {
    private final static int ENERGY_DECREASE = 10;
    private String name;
    private int energyRequired;

    public PresentImpl(String name, int energyRequired) {
        this.setName(name);
        this.setEnergyRequired(energyRequired);
    }

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new NullPointerException(ExceptionMessages.PRESENT_NAME_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public int getEnergyRequired() {
        return this.energyRequired;
    }

    private void setEnergyRequired(int energyRequired) {
        if (energyRequired < 0) {
            throw new IllegalArgumentException(ExceptionMessages.PRESENT_ENERGY_LESS_THAN_ZERO);
        }

        this.energyRequired = energyRequired;
    }

    @Override
    public void getCrafted() {
        int energyAfterCrafting = this.energyRequired - ENERGY_DECREASE;

        if (energyAfterCrafting <= 0) {
            this.setEnergyRequired(0);
        } else {
            this.setEnergyRequired(energyAfterCrafting);
        }
    }

    @Override
    public boolean isDone() {
        return this.energyRequired <= 0 ? true : false;
    }
}
