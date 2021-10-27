package Question6;

import java.sql.SQLOutput;

public class FractionMain {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(6,4);

        System.out.println(Fraction.compareTo(f1,f2));


    }
}
