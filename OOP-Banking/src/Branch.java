import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name ,ArrayList<Customer> customers) {
        this.name = name;
        this.customers = customers;
    }

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(String name, double initialTransaction){
        Customer customer = new Customer(name, initialTransaction);
        this.customers.add(customer);
        System.out.println("Customer " + customer.getName() + " added to branch " + this.name + ".");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addTransaction(Customer customer, double transaction){
        this.customers.get(this.customers.indexOf(customer)).addTransaction(transaction);
        System.out.println("Added transaction " +transaction + " to" + customer.getName() + " from branch " + this.name);
    }

    public Customer getCustomer(String name){
        return this.customers.stream().filter(o -> o.getName() == name).findFirst().orElse(null);
    }
}
