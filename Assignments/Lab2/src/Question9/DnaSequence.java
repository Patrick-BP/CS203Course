package Question9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DnaSequence {
    public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    while(true){
        System.out.println("Enter codons here");
        String str = key.nextLine();
        if(str.isEmpty()) {break;}
        ArrayList<String> result = storeCodons(str);
        for (String e: result) {
            System.out.print(e+", ");

        }
        System.out.println();
    }

    }

    public static ArrayList<String> storeCodons(String str){
        ArrayList codonsList = new ArrayList<String>();

        for (int i = 0; i <str.length() ; i += 3) {
            if(str.length()< (i+3)) {break;}
            codonsList.add(str.substring(i, i+3));

        }

        return codonsList;
    }
}
