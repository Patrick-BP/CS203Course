package Question8.myutil;

public class Person { // make Person class as public and import it in other classes outside the myutil
    private String name;
    public Person( ) {
        name = "Unknown";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
