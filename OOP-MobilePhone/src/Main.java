public class Main {
    public static void main(String[] args) {
        MobilePhone mob = new MobilePhone("1321312");
        mob.addNewContact(new Contact("123123", "Bob"));
        mob.addNewContact(new Contact("231212312", "Dob"));
        mob.addNewContact(new Contact("21312", "Wob"));
        mob.addNewContact(new Contact("423432", "Rob"));

        mob.printContacts();

        System.out.println(mob.findContact("Rsob"));
    }
}