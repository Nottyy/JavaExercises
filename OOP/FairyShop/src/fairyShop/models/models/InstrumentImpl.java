package fairyShop.models.models;

import fairyShop.common.ExceptionMessages;
import fairyShop.models.interfaces.Instrument;

public class InstrumentImpl implements Instrument {
    private static final int POWER_DECREASE = 10;
    private int power;

    public InstrumentImpl(int power) {
        this.setPower(power);
    }

    private void setPower(int power) {
        if (power < 0) {
            throw new IllegalArgumentException(ExceptionMessages.INSTRUMENT_POWER_LESS_THAN_ZERO);
        }

        this.power = power;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void use() {
        int powerAfterUse = this.power - POWER_DECREASE;

        if (powerAfterUse <= 0) {
            this.setPower(0);
        } else {
            this.setPower(powerAfterUse);
        }
    }

    @Override
    public boolean isBroken() {
        return this.power == 0 ? true : false;
    }
}
