public class Address {
    private int type ;
    private   String street;
    private String city;
    private String state;
    private int zip;
    public Address() {
        this.type = 1;
        this.street =" 1000 N. 4th St";
        this.city = "Fairfield";
        this.state = "Iowa";
        this.zip = 52557;
    }
    public Address(int type, String street, String city, String state, int zip) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }



    @Override
    public String toString() {
        return "Address{" +
                "type=" + type +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
