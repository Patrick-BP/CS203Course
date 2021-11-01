package two;

import one.Business;
import one.Person;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact>  personalContacts = new ArrayList<>();
    List<Contact>  businessContacts = new ArrayList<>();

    public AddressBook() {

    }

    public AddressBook(List<Contact> personalContacts, List<Contact> businessContacts) {
        this.personalContacts = personalContacts;
        this.businessContacts = businessContacts;
    }

    public List<Contact> getPersonalContacts() {
        return personalContacts;
    }

    public List<Contact> getBusinessContacts() {
        return businessContacts;
    }

    public boolean addPersonalContact(Contact cont){
        personalContacts.add(cont);
        return true;
    }
    public boolean addBusinessContact(Contact cont){
        businessContacts.add(cont);
        return true;
    }

    public boolean deletePersonalContact(Contact cont){

            personalContacts.remove(cont);



        return true;
    }
    public boolean deleteBusinessContact(Contact cont){

            businessContacts.remove(cont);


        return true;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "personalContacts=" + personalContacts +
                ", businessContacts=" + businessContacts +
                '}';
    }
}
