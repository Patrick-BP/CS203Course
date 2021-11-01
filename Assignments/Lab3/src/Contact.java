import java.util.ArrayList;
import java.util.List;

public class Contact {
    private  String firstName;
    private String lastName;
    private List<PhoneNumber> phoneNumber = new ArrayList<>();
    private List<EmailAddress> emailAddress = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
    private String notes;


    public Contact() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.addresses = addresses;
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