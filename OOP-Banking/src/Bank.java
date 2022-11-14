import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
        System.out.println("Branch " + branch.getName() + " added to bank " + this.name);
    }

    public void addCustomerToBranch(String branchName, String customerName, double transaction) {
        Branch branch = getBranch(branchName);
        branch.addCustomer(customerName, transaction);
        System.out.println("Customer " + customerName + " from bank "
                + this.name + " with initial transaction -> " + transaction);
    }

    public void addTransactionToCustomer(String branchName, String customerName, double transaction){
        Branch branch = getBranch(branchName);
        branch.addTransaction(branch.getCustomer(customerName), transaction);
        System.out.println("Transaction of " + transaction + " was added to Customer "
                + customerName + " from branch " + branchName);
    }

    public void printAllCustomersFromBranch(String branchName){
        Branch branch = getBranch(branchName);
        var branchCustomers = branch.getCustomers();

        for (int i = 0; i < branchCustomers.size(); i++){

            System.out.println(i + 1 + ". " + branchCustomers.get(i).getName());
            var allTransactions = branchCustomers.get(i).getDoubles();

            for (int j = 0; j < allTransactions.size(); j++){
                double transaction = allTransactions.get(j);
                System.out.println("   " + transaction);
            }
        }
    }

    private Branch getBranch(String branchName) {
        Branch branch = this.branches.stream().filter(o -> o.getName() == branchName).findFirst().orElse(null);
        return branch;
    }
}
