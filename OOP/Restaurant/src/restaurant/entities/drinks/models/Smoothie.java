package restaurant.entities.drinks.models;

public class Smoothie extends baseBeverage{
    private final static double PRICE_SMOOTHIE = 4.50;

    public Smoothie(String name, int counter, double price, String brand) {
        super(name, counter, PRICE_SMOOTHIE, brand);
    }
}
