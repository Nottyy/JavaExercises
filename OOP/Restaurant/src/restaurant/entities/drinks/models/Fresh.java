package restaurant.entities.drinks.models;

public class Fresh extends baseBeverage {
    private final static double PRICE_FRESH = 3.50;

    public Fresh(String name, int counter, String brand) {
        super(name, counter, PRICE_FRESH, brand);
    }
}
