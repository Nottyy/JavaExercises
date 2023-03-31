package restaurant.entities.healthyFoods.models;

public class Salad extends baseFood {
    private final static int INITIAL_SALAD_PORTION = 150;

    public Salad(String name, double price) {
        super(name, INITIAL_SALAD_PORTION, price);
    }
}
