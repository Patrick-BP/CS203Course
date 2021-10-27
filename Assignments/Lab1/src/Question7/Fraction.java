package Question7;

public class Fraction {
    private int x;
    private int y;
    private double z;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int compareTo(Fraction f2){
        if ((this.x/this.y) < (f2.x/ f2.y )) return -1;
        else if( (this.x/this.y) == (f2.x/ f2.y) ) return 0;
        else return 1;

    }
}

