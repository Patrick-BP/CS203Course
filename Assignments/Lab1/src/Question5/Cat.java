package Question5;

public class Cat {
    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_HGT = 6;
    private static final double DEFAULT_WGT = 10.0;
    private String name;
    private int height;
    private double weight;

    public Cat( ) {

        this(DEFAULT_NAME,DEFAULT_HGT,DEFAULT_WGT);

    }
    public Cat(String name) {

        this(name,DEFAULT_HGT,DEFAULT_WGT);

    }
    public Cat(String name, int height) {

        this(name,height,DEFAULT_WGT);

    }
    public Cat(String name, double weight) {

        this(name,DEFAULT_HGT,weight);

    }
    public Cat(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

}
