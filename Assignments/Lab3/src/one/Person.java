package one;


import java.util.List;

public class Person extends Contacts {
    private String lname;

    public Person() {

    }

    public Person(String name, String lname, List<String> phone, List<String> email, List<Address> address, String note) {
        super(name, phone, email, address, note);
        this.lname = lname;
    }
    public Person(String name, String lname, List<String> phone, List<String> email, List<Address> address) {
        super(name, phone, email, address);
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\nname: " + getName() +
                "\nlName: " + getLname() +
                "\nPhone Number: " + getPhone()+
                "\nEmail: " + getEmail()+
                "\nAddress: " +getAddress() +
                "\nNote: " +getNote()+

                "\n}";
    }
}
