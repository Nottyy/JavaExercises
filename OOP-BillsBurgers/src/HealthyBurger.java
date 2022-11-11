public class HealthyBurger extends Hamburger{
    private double price = 14.99;
    private int maxAdditions = 6;

    @Override
    public double getBasePrice() {
        return this.price;
    }

    public HealthyBurger(String meat) {
        super("brownTypeRoll", meat);
    }
}
