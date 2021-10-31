package two;

public class Person extends Contacts{
    private String lname;

    public Person() {

    }

    public Person(String name,Address address, String phone, String email, String note,String lname) {
        super(name, address, phone, email, note);
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
