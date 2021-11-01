package Question8;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class FortuneTeller {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10);
        list.add("You will get 4.0 GPA this semester");
        list.add("Happiness is programming");
        list.add("Satisfaction follows hard work.");
        list.add("Patience is virtue.");


                System.out.println(fortunes(list));

    }
    public static String fortunes(ArrayList<String> arrList){
        Random rand = new Random();
        String result="";
        int randIndex ;
        randIndex = rand.nextInt(arrList.size());
        result = arrList.get(randIndex);
        return result;
    }


}
