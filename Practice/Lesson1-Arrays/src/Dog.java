public class Dog {

    private String name;
    private double weight;
    private double height;

    public Dog(double weight, String name ) {
        this.name = name;
        this.weight = weight;
    }
    public Dog(String name, double height) {
        this.name = name;
        this.height= height;
    }

    public int move(double length) {
        return 0;
    }
    public void move( ) {

    }
}
