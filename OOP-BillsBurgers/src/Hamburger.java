import java.util.ArrayList;

public class Hamburger {
    private int maxAdditions = 4;
    private String breadRollType;
    private String meat;
    private double price = 8.99;
    private ArrayList<Addition> additions;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.additions = new ArrayList<Addition>(this.maxAdditions);
    }

    public double getBasePrice() {
        return price;
    }

    public ArrayList<Addition> getAdditions() {
        return additions;
    }

    public void addAddition(Addition addition) {
        if (this.additions.size() < maxAdditions) {
            this.additions.add(addition);
            System.out.println("Addition " + addition.getName() + " added.");
        } else {
            System.out.println("You cannot add more than " + this.maxAdditions + " additions on a " + this.getClass().getSimpleName());
        }
    }

    public double calculateBurgerPrice() {
        var totalAdditionsPrice = additions.stream().mapToDouble(o -> o.getPrice()).sum();
        var totalBurgerPrice = totalAdditionsPrice + this.getBasePrice();

        return totalBurgerPrice;
    }
}
