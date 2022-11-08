public class Main {
    public static void main(String[] args) {
        var vehicle = new Vehicle(150);
        vehicle.move();

        var car = new Car(150);
        car.move();
        car.increaseSpeed(20);
        car.increaseSpeed(200);
        car.decreaseSpeed(100);

        var toyota = new Toyota(150, true);
        toyota.playMusic("kuku");
    }
}