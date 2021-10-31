package two;

public class Business extends Contacts{

    public Business() {
    }

    public Business(String name, Address address, String phone, String email, String note) {
        super(name, address, phone, email, note);
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
