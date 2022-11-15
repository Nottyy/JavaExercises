public class Main {
    public static void main(String[] args) {
        Switchable switchableFan = new Fan();
        Switchable switchableBulb = new LightBulb();

        ElecticSwitch electricSwitch = new ElecticSwitch(switchableBulb);

        electricSwitch.press();
        electricSwitch.press();
        System.out.println(switchableBulb.getClass().getSimpleName() + " is turned " +
                (electricSwitch.isOn() ? "ON" : "OFF"));
    }
}