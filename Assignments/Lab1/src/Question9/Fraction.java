package Question9;

public class Fraction {
    private double fractionalNumber;

    public Fraction(int base, double decimal) {
        fractionalNumber = base + (decimal/10);
    }
    public int compare(Fraction f){
        if (this.fractionalNumber < f.fractionalNumber) return -1;
        else if(this.fractionalNumber == f.fractionalNumber) return 0;
        else return 1;

    }
}

