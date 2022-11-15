public class LightBulb implements Switchable{
    public LightBulb(){

    }
    @Override
    public void turnOn() {
        System.out.println("Light bulb -> Turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb -> Turned OFF");
    }
}
