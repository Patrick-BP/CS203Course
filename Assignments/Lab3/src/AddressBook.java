

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact>  personalContacts ;
    List<Contact>  businessContacts ;

    public AddressBook() {
        personalContacts = new ArrayList<>();
        businessContacts = new ArrayList<>();
    }

    public List<Contact> getPersonalContacts() {
        return personalContacts;
    }

    public List<Contact> getBusinessContacts() {
        return businessContacts;
    }



    void addPersonalContact(Contact cont){
        personalContacts.add(cont);
    }

    void addBusinessContact(Contact cont){
        businessContacts.add(cont);
    }

  void deletePersonalContact(Contact cont){
            personalContacts.remove(cont);
    }
    void deleteBusinessContact(Contact cont){
            businessContacts.remove(cont);
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "personalContacts=" + personalContacts +
                ", businessContacts=" + businessContacts +
                '}';
    }
}
