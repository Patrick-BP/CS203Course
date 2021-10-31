package two;

public class ContactsMain {
    public static void main(String[] args) {
        Contacts c1 = new Contacts();
        Person p1 = new Person("Patrick",new Address("1000 N 4th st","Fairfield","Iowa",52557),"4692150557","papybp@gmail.com","note goes here","Bihizi");
        Person p2 = new Person("Chadia",new Address("329 HighLand","Fairfield","Iowa",52556),"2402423423","chadia@gmail.com","note goes here","Nyasafari");

        Business b1 = new Business("Google",new Address("9959 Adleta blvd","Dallas","Texas",75243),"4690000000","google@gmail.com"," Note goes here"  );

        Contacts[] cont = {p1,p2,b1};
        for (Contacts e: cont) {
            System.out.println(e+ "\n");
        }
    }

}
