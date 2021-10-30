package Question9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DnaSequence {
    public static void main(String[] args) {

        System.out.println(storeCodons("GATTCGATC"));
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
