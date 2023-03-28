package goldDigger.core;

import goldDigger.common.ConstantMessages;
import goldDigger.common.ExceptionMessages;
import goldDigger.models.discoverer.Anthropologist;
import goldDigger.models.discoverer.Archaeologist;
import goldDigger.models.discoverer.Discoverer;
import goldDigger.models.discoverer.Geologist;
import goldDigger.models.spot.Spot;
import goldDigger.models.spot.SpotImpl;
import goldDigger.repositories.DiscovererRepository;
import goldDigger.repositories.SpotRepository;

public class ControllerImpl implements Controller {
    private DiscovererRepository discovererRepo;
    private SpotRepository spotRepo;

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
        return null;
    }

    @Override
    public String inspectSpot(String spotName) {
        return null;
    }

    @Override
    public String getStatistics() {
        return null;
    }
}
