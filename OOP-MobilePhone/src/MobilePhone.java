import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        boolean contains = this.myContacts.add(contact);
        System.out.println(contains == true ? "List contains " + contact.getName() : "List doesn't contain " + contact.getName());
        return contains;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        boolean contains;
        if (this.myContacts.contains(oldContact)){
            contains = true;
            int pos = this.myContacts.indexOf(oldContact);
            this.myContacts.set(pos, newContact);
            System.out.println("New contact " + newContact.getName() + " was successfully added.");
        }
        else{
            System.out.println("Contact " + oldContact.getName() + " is not in the list.");
            contains = false;
        }

        return contains;
    }

    public boolean removeContact(Contact contact){
        boolean removed = this.myContacts.remove(contact);
        if (removed){
            System.out.println("Contact " + contact.getName() + " removed.");
        }
        else{
            System.out.println("Contact " + contact.getName() + " is not in the list.");
        }

        return removed;
    }

    public int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    public int findContact(String name){
        var contact = this.myContacts.stream().filter(o -> o.getName() == name).findFirst().orElse(null);

        return this.myContacts.indexOf((Contact)contact);
    }

    public Contact queryContact(String name){
        return this.myContacts.stream().filter(o -> o.getName() == name).findFirst().orElse(null);
    }

    public void printContacts(){
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println(this.myContacts.get(i).getName() + " " + this.myContacts.get(i).getPhone());
        }
    }
}
