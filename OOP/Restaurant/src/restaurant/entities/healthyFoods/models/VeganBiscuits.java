package restaurant.entities.healthyFoods.models;

public class VeganBiscuits extends baseFood {
    private final static int INITIAL_VEGAN_BISCUITS_PORTION = 205;

    public VeganBiscuits(String name, double portion, double price) {
        super(name, INITIAL_VEGAN_BISCUITS_PORTION, price);
    }
}
