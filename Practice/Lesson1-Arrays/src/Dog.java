pubpublic class BookAddress {
    public static void main(String[] args){

        List<Contact> person = new ArrayList<Contact>();
        List<Contact> business = new ArrayList<Contact>();
        Address address1 = new Address();
        Address address2 = new Address("4600 colony","Charlotte","North Carolina",28226);
        Address address3 = new Address("704 sharview circle","Charlotte","North Carolina",27227);
        Contact c = new Contact("chadia");
        c.getPhoneNumber().add("7850265012");
        c.getPhoneNumber().add("000000000000");
        c.getEmail().add("bella@miu.edu");
        c.getAddresses().add(address1);
        business.add(c);
        System.out.println("=========================================");
        c.displayBusiness();
        person.add(c);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        Contact c2= new Contact("Keza","Tehillah");
        c2.getPhoneNumber().add("704302560");
        c2.getEmail().add("keza@miu.edu");
        c2.getAddresses().add(address2);
        person.add(c2);
        c2.displayPerson();
        System.out.println("***********************editing existing address of Business*****************************");

        c.getAddresses().set(0,address3);
        c.displayBusiness();
        System.out.println("______________________editing existing email of person_____________________________________");
        c2.getEmail().set(0,"teillah@gmail.com");
        c2.displayPerson();
// remove contact
        //  person.remove(c);
        System.out.println("______________________Patrick _____________________________________");
        System.out.println("Person contacts{ \n"+  person+ " \n}");
        System.out.println(" ");
        System.out.println("Business contacts{ \n"+business+ " \n}");
    }