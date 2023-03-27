import java.util.LinkedList;
import java.util.List;

public class Level {
    public int SLOTS_PER_ROW = 2;
    public int levelNumber;
    public int rows;
    public List<ParkingSlot> takenSlots;

    public Level(int levelNumber, int rows) {
        this.levelNumber = levelNumber;
        this.rows = rows;
        this.takenSlots = new LinkedList<ParkingSlot>();
    }

    public ParkingSlot findAvailableSlot() {
        int totalNumOfCars = rows * SLOTS_PER_ROW;

        if (this.takenSlots.size() >= totalNumOfCars) {
            return null;
        } else if (takenSlots.isEmpty()) {
            return new ParkingSlot(0, 0, levelNumber);
        } else {
            ParkingSlot last = this.takenSlots.get(this.takenSlots.size() - 1);

            int rowToAdd = last.row;
            int colToAdd = last.col;
            if (SLOTS_PER_ROW >= last.col) {
                rowToAdd++;
                colToAdd++;
            } else {
                colToAdd++;
            }

            return new ParkingSlot(rowToAdd, colToAdd, levelNumber);
        }
    }

    public boolean park(Car car) {
        ParkingSlot freeSlot = this.findAvailableSlot();

        if (freeSlot == null) {
            return false;
        } else {
            freeSlot.park(car);
            this.takenSlots.add(freeSlot);
            return true;
        }
    }
}
