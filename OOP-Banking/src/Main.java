public class Main {
    public static void main(String[] args) {
//        Customer customer1 = new Customer("Gosho", 1.55);
//        Customer customer2 = new Customer("Gosho1", 2.55);
//        Customer customer3 = new Customer("Gosho2", 3.55);
//        Customer customer4 = new Customer("Gosho3", 4.55);
//        Customer customer5 = new Customer("Gosho4", 5.55);
//        Customer customer6 = new Customer("Gosho5", 6.55);

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