<<<<<<< HEAD
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("1234");
        Level lvl1 = new Level(1, 5);
        Level lvl2 = new Level(2, 2);
        Level lvl3 = new Level(3, 3);

        ArrayList<Level> list = new ArrayList<Level>();
        list.add(lvl1);
        list.add(lvl2);
        list.add(lvl3);

        ParkingLot parkinglot = new ParkingLot(list);
        System.out.println(parkinglot.park(car));


=======
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
>>>>>>> origin/master
    }
}