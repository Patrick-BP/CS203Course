package Question8;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class FortuneTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10);
        list.add("You will get 4.0 GPA this semester");
        list.add("Happiness is programming");
        list.add("Satisfaction follows hard work.");
        list.add("Patience is virtue.");
        list.add("The greatest risk is not taking one.");
        list.add("You will marry your lover.");
        list.add("The greatest risk is not taking one.");
        list.add("You cannot love life until you live the life you love.");
        list.add("Nothing astonishes men so much as common sense and plain dealing.");
        list.add("You will be called in to fulfill a position of high honor and responsibility.");
        Scanner key = new Scanner(System.in);
        while(true){
            System.out.println("\nFortune (Y/N) ? ");
            String input = key.nextLine();
            if(input.equalsIgnoreCase("y")){
                System.out.println(Fortune.fortune(list));
            }
            else {System.out.println("Good Bye!"); break;}
        }
    }


}
