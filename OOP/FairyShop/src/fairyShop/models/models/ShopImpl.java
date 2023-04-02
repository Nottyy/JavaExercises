package fairyShop.models.models;

import fairyShop.models.interfaces.Helper;
import fairyShop.models.interfaces.Instrument;
import fairyShop.models.interfaces.Present;
import fairyShop.models.interfaces.Shop;

public class ShopImpl implements Shop {
    private int brokenInstruments;

    public ShopImpl() {
        this.brokenInstruments = 0;
    }

    public int getBrokenInstruments() {
        return this.brokenInstruments;
    }

    @Override
    public void craft(Present present, Helper helper) {
        if (helper.canWork()) {
            for (Instrument instr : helper.getInstruments()) {
                while (instr.isBroken() == false) {
                    if (helper.canWork()) {

                        present.getCrafted();
                        helper.work();
                        instr.use();

                        if (present.isDone() == true || helper.canWork() == false) {
                            if (instr.isBroken()) {
                                this.brokenInstruments++;
                            }
                            return;
                        }
                    }
                }
                this.brokenInstruments++;
            }
        }
    }
}
