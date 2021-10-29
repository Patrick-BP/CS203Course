package Question8;

import java.util.ArrayList;
import java.util.Random;

public class Fortune {

    public static String fortune(ArrayList<String> arrList){
        Random rand = new Random();
        String result="";
        int randIndex ;
        randIndex = rand.nextInt(arrList.size())+0;
        result = arrList.get(randIndex);
        return result;
    }

}
