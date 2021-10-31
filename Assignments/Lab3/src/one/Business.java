package one;


import java.util.List;

public class Business extends Contacts {

    public Business() {
    }

    public Business(String name, List<String> phone, List<String> email, List<Address> address, String note) {
        super(name, phone, email, address, note);
    }
    public Business(String name, List<String> phone, List<String> email, List<Address> address) {
        super(name, phone, email, address);
    }

    @Override
    public String toString() {
        return "Business{" +
                "\nname: " + getName() +
                "\nPhone Number: " + getPhone()+
                "\nEmail: " + getEmail()+
                "\nAddress: " +getAddress() +
                "\nNote: " +getNote()+
                "\n}";
    }
}
