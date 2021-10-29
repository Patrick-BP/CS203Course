package Question7;

import java.util.Arrays;
import java.util.Random;

public class DailyTemp {
    public static void main(String[] args) {
        int[] temps = new int[365];
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"jan", "Feb", "march","april","mai","june","july","aug","sept","oct","nov","dec"};
        Random rand = new Random();

        for (int i = 0; i < temps.length; i++) {
            temps[i] = rand.nextInt(96)+10;
        }
        System.out.println(Arrays.toString(temps));
        int min = temps[0];
        int indexMin=0;
        int max = temps[0];
        int indexMax = 0;
        for (int i = 1; i < temps.length; i++) {
            if(temps[i] > max){
                max = temps[i];

            }
        }
        for (int i = 1; i < temps.length; i++) {
            if(temps[i] < min){
                min = temps[i];
            }
        }
        System.out.println("maximum: "+ max);
        System.out.println("minimum: "+min);

    }
}
