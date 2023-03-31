package restaurant.entities.tables.models;

public class InGarden extends baseTable {
    private static final double INGARDEN_PRICE_PER_PERSON = 4.50;

    public InGarden(int number, int size, double pricePerPerson) {
        super(number, size, INGARDEN_PRICE_PER_PERSON);
    }
}
