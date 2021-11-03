import java.util.ArrayList;
import java.util.List;

public class Contact {
    private  String firstName;
    private String lastName;
    private List<PhoneNumber> phoneNumber ;
    private List<EmailAddress> emailAddress ;
    private List<Address> addresses ;
    private String notes;


    public Contact() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.phoneNumber  = new ArrayList<>();
        this.emailAddress = new ArrayList<>();
        this.addresses = new ArrayList<>();
        this.notes = " note here";
    }

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber  = new ArrayList<>();
        this.emailAddress = new ArrayList<>();
        this.addresses = new ArrayList<>();
        this.notes = " note here";
    }

    public Contact(String firstName, String lastName, List<PhoneNumber> phoneNumber, List<EmailAddress> emailAddress, List<Address> addresses, String notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.addresses = addresses;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    public List<EmailAddress> getEmailAddress() {
        return emailAddress;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress=" + emailAddress +
                ", addresses=" + addresses +
                ", notes='" + notes + '\'' +
                '}';
    }
}