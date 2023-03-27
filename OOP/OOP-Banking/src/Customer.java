import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> doubles;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getDoubles() {
        return doubles;
    }

    public Customer(String name, double initial) {
        this.name = name;
        this.doubles = new ArrayList<Double>();
        this.doubles.add(initial);
    }

    public void addTransaction(double transaction){
        this.doubles.add(transaction);
    }
}
