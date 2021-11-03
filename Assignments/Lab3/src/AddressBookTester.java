import java.util.ArrayList;
import java.util.List;

public class AddressBookTester {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        Contact p2 = new Contact();
        Contact p1 = new Contact("William", "Messi");
        PhoneNumber messiphone = new PhoneNumber();
        EmailAddress messiEmailAddress = new EmailAddress(0,"messiw@gmail.com");
        Address messiAddress = new Address(1,"9959 Adleta blvd","Dallas","TX",75243);
        p1.getPhoneNumber().add(messiphone);
        p1.getAddresses().add(messiAddress);
        p1.getEmailAddress().add(messiEmailAddress);


        Contact b2 = new Contact("Ronald", null);
        PhoneNumber ronaldphone = new PhoneNumber();
        EmailAddress ronaldEmailAddress = new EmailAddress(1,"ronald@gmail.com");
        Address ronaldAddress = new Address(1,"1000 4th street","fairfield","iowa",52557);
        b2.getPhoneNumber().add(ronaldphone);
        b2.getAddresses().add(ronaldAddress);
        b2.getEmailAddress().add(ronaldEmailAddress);











//        AddressBook obj= new AddressBook();
//
//        Address address1 = new Address(0,"501 w","FF","IA",52557);
//        List<Address> addresslist = new ArrayList<>();
//        addresslist.add(address1);
//
//        PhoneNumber phone1= new PhoneNumber(0,788604535);
//        List<PhoneNumber> phonelist = new ArrayList<>();
//        phonelist.add(phone1);
//
//        EmailAddress email1 = new EmailAddress(0,"keke@miu.edu");
//        List<EmailAddress> emaillist = new ArrayList<>();
//        emaillist.add(email1);
//
//        Contact contact1= new Contact("keza","Tete",phonelist,emaillist,addresslist,"hello");
//        obj.addPersonalContact(contact1);
//
//
//
//        Address address2 = new Address(0,"507 w","FF","IA",52558);
//        ArrayList<Address> listaddress2 = new ArrayList<>();
//        listaddress2.add(address2);
//
//        PhoneNumber phone2= new PhoneNumber(0,8897654);
//        ArrayList<PhoneNumber> listPhone2 = new ArrayList<>();
//        listPhone2.add(phone2);
//
//        EmailAddress email2 = new EmailAddress(0,"kenzi@miu.edu");
//        ArrayList<EmailAddress> listEmail2= new ArrayList<>();
//        listEmail2.add(email2);
//
//        Contact contact2= new Contact("Google","",listPhone2,listEmail2,listaddress2,"who are you");
//        obj.addPersonalContact(contact2);
//
//
//        System.out.println(obj);
//        obj.deletePersonalContact(contact1);
//        System.out.println(obj);
//
//
//       obj.deletePersonalContact(contact2);
//       System.out.println(obj);

    }

}
