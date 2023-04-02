package fairyShop.core;

import fairyShop.common.ConstantMessages;
import fairyShop.common.ExceptionMessages;
import fairyShop.models.interfaces.Helper;
import fairyShop.models.interfaces.Instrument;
import fairyShop.models.interfaces.Present;
import fairyShop.models.models.*;
import fairyShop.repositories.HelperRepository;
import fairyShop.repositories.PresentRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private HelperRepository<Helper> helperRepo;
    private PresentRepository<Present> presentRepo;
    private ShopImpl shop;
    private int presentsDone;

    public ControllerImpl() {
        this.helperRepo = new HelperRepository<>();
        this.presentRepo = new PresentRepository<>();
        this.shop = new ShopImpl();
        this.presentsDone = 0;
    }

    @Override
    public String AddHelper(String type, String helperName) {
        Helper hp;

        if (type.equals(Happy.class.getSimpleName())) {
            hp = new Happy(helperName);
        } else if (type.equals(Sleepy.class.getSimpleName())) {
            hp = new Sleepy(helperName);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.HELPER_TYPE_DOESNT_EXIST);
        }

        this.helperRepo.add(hp);

        return String.format(ConstantMessages.ADDED_HELPER, type, helperName);
    }

    @Override
    public String AddInstrumentToHelper(String helperName, int power) {
        Helper hp = this.helperRepo.findByName(helperName);

        if (hp == null) {
            throw new IllegalArgumentException(ExceptionMessages.HELPER_DOESNT_EXIST);
        }

        Instrument instr = new InstrumentImpl(power);
        hp.addInstrument(instr);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_INSTRUMENT_TO_HELPER, power, helperName);
    }

    @Override
    public String AddPresent(String presentName, int energyRequired) {
        Present pr = new PresentImpl(presentName, energyRequired);
        this.presentRepo.add(pr);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_PRESENT, presentName);
    }

    @Override
    public String CraftPresents(String presentName) {
        List<Helper> hps = this.helperRepo.getModels().stream()
                .filter(x -> x.getEnergy() > 50).collect(Collectors.toList());

        if (hps.size() == 0) {
            throw new IllegalArgumentException(ExceptionMessages.NO_HELPER_READY);
        }

        Present pr = this.presentRepo.findByName(presentName);
        for (Helper hp : hps) {
            shop.craft(pr, hp);

            if (pr.isDone()) {
                this.presentsDone++;
                break;
            }
        }

        return String.format(ConstantMessages.PRESENT_DONE, presentName,
                pr.isDone() ? "done" : "not done", this.shop.getBrokenInstruments());
    }

    @Override
    public String Report() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format(ConstantMessages.COUNT_PRESENTS_DONE, this.presentsDone));
        sb.append(System.lineSeparator());
        sb.append("Helpers info:");
        sb.append(System.lineSeparator());

        for (Helper hp : this.helperRepo.getModels()) {
            sb.append("Name: " + hp.getName());
            sb.append(System.lineSeparator());
            sb.append("Energy: " + hp.getEnergy());
            sb.append(System.lineSeparator());
            long notBrokenInstr = hp.getInstruments().stream().filter(x -> x.isBroken() == false).count();
            sb.append("Instruments: " + notBrokenInstr + " not broken left");
            sb.append(System.lineSeparator());

        }

        return sb.toString();
    }
}
