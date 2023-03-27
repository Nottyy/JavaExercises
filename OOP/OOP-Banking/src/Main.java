public class Main {
    public static void main(String[] args) {

        Branch branch = new Branch("Serdika");
        branch.addCustomer("Gosho", 44.44);
        branch.addCustomer("Kuku", 33.33);
        branch.addCustomer("akaka", 22.22);
        branch.addCustomer("wewe", 11.11);
        branch.addCustomer("rrrr", 66.66);
        branch.addCustomer("Koko", 77.77);
        System.out.println();

        Bank bank = new Bank("Pasmina");
        bank.addBranch(branch);
        bank.addCustomerToBranch("Serdika", "kucheto", 2.40);
        bank.addCustomerToBranch("Serdika", "pafkata", 3.40);
        bank.addCustomerToBranch("Serdika", "senatora", 999.40);

        bank.printAllCustomersFromBranch("Serdika");
        bank.addTransactionToCustomer("Serdika", "pafkata", 11.12);
        bank.printAllCustomersFromBranch("Serdika");
    }
}