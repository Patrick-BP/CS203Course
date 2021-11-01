package one;


import java.util.ArrayList;
import java.util.List;

public class ContactsMain {
    public static void main(String[] args) {

        Contacts c1 = new Contacts("Google");
        Address ad1 = new Address("1000 N 4th st", "Fairfield","Iowa", 52557);
        Address ad2 = new Address("9959 Adleta blvd","Dallas","TX",75243);
        c1.getPhone().add("4692345345");
        c1.getPhone().add("3453453456");
        c1.getAddress().add(ad1);
        c1.getAddress().add(ad2);
        c1.getEmail().add("google@gmail.com");
        c1.getEmail().add("gooleemali@gmail.com");
        c1.setNote("the is an American company");


        Contacts c2 = new Contacts("Facebook");
        Address ad3 = new Address("4000 N 6th st", "Highland","Iowa", 52557);
        Address ad4 = new Address("345 skillman blvd","Dallas","TX",75243);
        c2.getPhone().add("469266665");
        c2.getPhone().add("663454566");
        c2.getAddress().add(ad3);
        c2.getAddress().add(ad4);
        c2.getEmail().add("facebook@gmail.com");
        c2.getEmail().add("facebookemali@gmail.com");
        c2.setNote("the is an big company");

        Contacts c3 = new Contacts("Patrick");
        Address ad5 = new Address("40005 N 4th st", "Fairfield","Iowa", 52557);
        Address ad6 = new Address("2000 madison blvd","Dallas","TX",75243);
        c3.getPhone().add("469233333");
        c3.getPhone().add("3456666666");
        c3.getAddress().add(ad5);
        c3.getAddress().add(ad6);
        c3.getEmail().add("email1@gmail.com");
        c3.getEmail().add("email3@gmail.com");



        Contacts c4 = new Contacts("Paul");
        Address ad7 = new Address("7686 N 6th st", "Highland","Iowa", 52557);
        Address ad8 = new Address("567 adison blvd","Dallas","TX",75243);
        c4.getPhone().add("469266665");
        c4.getPhone().add("663454566");
        c4.getAddress().add(ad7);
        c4.getAddress().add(ad8);
        c4.getEmail().add("paul@gmail.com");


        List<Person> personList = new ArrayList<>();
        List<Business> BusinessList = new ArrayList<>();

       // personList.add(c3,c4);







    }
}
