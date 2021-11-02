package Question8;

public class Fraction {
    private double fractionalNumber;

    public Fraction(int base, double decimal) {
        fractionalNumber = base + (decimal/10);
    }

    public static int compare(Fraction f1, Fraction f2){
        if (f1.fractionalNumber < f2.fractionalNumber) return -1;
        else if(f1.fractionalNumber == f2.fractionalNumber) return 0;
        else return 1;

    }
}

