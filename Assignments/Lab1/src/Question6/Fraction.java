package Question6;

public class Fraction {
    private int x;
    private int y;
    private double z;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;

    }



    public static int compareTo(Fraction f1, Fraction f2){
        if ((f1.x/f1.y) < (f2.x/ f2.y )) return -1;
        else if( (f1.x/ f1.y) == (f2.x/ f2.y) ) return 0;
        else return 1;

    }
}

