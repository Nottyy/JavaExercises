public class HealthyBurger extends Hamburger{
    private double price = 14.99;
    private int maxAdditions = 6;

    @Override
    public double getBasePrice() {
        return this.price;
    }

    public HealthyBurger(String meat, int maxAdditions) {
        super("brown", meat, 6);
        this.addAddition(new Chips("Crispy", 1.44));
        this.addAddition(new Lettuce("Green", 0.22));
    }
}
