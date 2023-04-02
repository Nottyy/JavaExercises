package fairyShop.models.models;

public class Sleepy extends baseHelper {
    public static final int SLEEPY_HELPER_INITIAL_ENERGY = 50;
    private static final int ADDITIONAL_ENERGY_DECREASE = 5;

    public Sleepy(String name) {
        super(name, SLEEPY_HELPER_INITIAL_ENERGY);
        this.decreaseValue = BASE_HELPER_INITIAL_ENERGY_DECREASE + ADDITIONAL_ENERGY_DECREASE;
    }
}
