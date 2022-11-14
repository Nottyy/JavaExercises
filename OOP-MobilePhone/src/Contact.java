public class Contact {
    private String phone;
    private String name;

    public Contact(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getName() {
        return this.name;
    }

    public static Contact createContact(String name, String phone){
        return new Contact(name, phone);
    }
}
