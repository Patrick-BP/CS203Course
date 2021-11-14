package Question1;

public class BoyAndGirlNames implements Comparable<BoyAndGirlNames>{
    private String name ;
    private int number;

    public BoyAndGirlNames(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "{" + name +", "+ number + "}";
    }

    @Override
    public int compareTo(BoyAndGirlNames o) {
        return (this.number - o.number)* -1;
    }
}
