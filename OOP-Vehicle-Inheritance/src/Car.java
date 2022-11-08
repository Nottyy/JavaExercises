public class Car extends Vehicle {
    private int gears;
    private int doors;
    public Car(int speed) {
        this(1, 1, speed);
    }

    public Car(int speed, int gears, int doors) {
        super(speed);

        this.gears = gears;
        this.doors = doors;
    }
}
