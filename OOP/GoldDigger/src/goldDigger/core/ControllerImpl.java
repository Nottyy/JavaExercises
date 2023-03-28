package goldDigger.core;

import goldDigger.common.ConstantMessages;
import goldDigger.common.ExceptionMessages;
import goldDigger.models.discoverer.Anthropologist;
import goldDigger.models.discoverer.Archaeologist;
import goldDigger.models.discoverer.Discoverer;
import goldDigger.models.discoverer.Geologist;
import goldDigger.models.operation.Operation;
import goldDigger.models.operation.OperationImpl;
import goldDigger.models.spot.Spot;
import goldDigger.models.spot.SpotImpl;
import goldDigger.repositories.DiscovererRepository;
import goldDigger.repositories.Repository;
import goldDigger.repositories.SpotRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {
    private final static int MIN_ENERGY_FOR_SPOT = 45;
    private Repository<Discoverer> discovererRepo;
    private Repository<Spot> spotRepo;

    public ControllerImpl() {
        this.discovererRepo = new DiscovererRepository();
        this.spotRepo = new SpotRepository();
    }

    @Override
    public String addDiscoverer(String kind, String discovererName) {
        Discoverer dsc;

        switch (kind) {
            case "Anthropologist":
                dsc = new Anthropologist(discovererName);
                break;
            case "Archaeologist":
                dsc = new Archaeologist(discovererName);
                break;
            case "Geologist":
                dsc = new Geologist(discovererName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.DISCOVERER_INVALID_KIND);
        }

        this.discovererRepo.add(dsc);
        return String.format(ConstantMessages.DISCOVERER_ADDED, kind, discovererName);
    }

    @Override
    public String addSpot(String spotName, String... exhibits) {
        Spot spot = new SpotImpl(spotName);

        for (String exb : exhibits) {
            spot.getExhibits().add(exb);
        }

        return String.format(ConstantMessages.SPOT_ADDED, spotName);
    }

    @Override
    public String excludeDiscoverer(String discovererName) {
        Discoverer dsc = this.discovererRepo.byName(discovererName);
        if (dsc != null){
            this.discovererRepo.remove(dsc);
            return String.format(ConstantMessages.DISCOVERER_EXCLUDE, discovererName);
        }
        else{
            throw new IllegalArgumentException(String.format(ExceptionMessages.DISCOVERER_DOES_NOT_EXIST, discovererName));
        }
    }

    @Override
    public String inspectSpot(String spotName) {
        Spot sp = this.spotRepo.byName(spotName);
        Operation op = new OperationImpl();
        List<Discoverer> dscs = this.discovererRepo.getCollection().stream()
                .filter(d ->d.getEnergy() > MIN_ENERGY_FOR_SPOT)
                .collect(Collectors.toList());
        if (dscs.isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.SPOT_DISCOVERERS_DOES_NOT_EXISTS);
        }

        long excludedDiscoverers = dscs.stream().filter(x -> x.getEnergy() == 0).count();

        return String.format(ConstantMessages.INSPECT_SPOT, spotName, excludedDiscoverers);
    }

    @Override
    public String getStatistics() {
        return null;
    }
}
