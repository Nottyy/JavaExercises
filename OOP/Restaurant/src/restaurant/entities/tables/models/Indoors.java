package restaurant.entities.tables.models;

public class Indoors extends baseTable {
    private final static double INDOORS_PRICE_PER_PERSON = 3.50;

    public Indoors(int number, int size) {
        super(number, size, INDOORS_PRICE_PER_PERSON);
    }
}
