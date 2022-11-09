public class Main {
    public static void main(String[] args) {
        Car bmw = new BMW(250);
        bmw.startEngine();
        bmw.accelerate(12);
        bmw.accelerate(180);
        bmw.brake();
        bmw.accelerate(200);
    }
}