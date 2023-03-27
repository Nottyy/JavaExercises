import java.util.List;

public class ParkingLot {
    public List<Level> levels;

    public ParkingLot(List<Level> levels) {
        this.levels = levels;
    }

    public boolean park(Car car) {
        for (Level lvl : levels) {
            if (lvl.park(car)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
