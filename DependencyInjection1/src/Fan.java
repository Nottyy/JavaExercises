public class Fan implements Switchable{
    public Fan(){

    }
    @Override
    public void turnOn() {
        System.out.println("Fan -> Turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan -> Turned OFF");
    }
}
