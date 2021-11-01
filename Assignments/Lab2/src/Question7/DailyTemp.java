package Question7;

import java.util.Arrays;
import java.util.Random;

public class DailyTemp {
    public static void main(String[] args) {
        double[] temperatures = new double[365];
        Random rand = new Random();
        for (int i = 0; i < temperatures.length; i++) {
           temperatures[i] = rand.nextInt(96) + 10;
        }

        System.out.println(Arrays.toString(hotCold(temperatures)));

    }

    public static double[] hotCold(double[] arr) {

        double hottest = arr[0];
        double coldest = arr[0];
        double[] arr2 = new double[2];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > hottest) hottest = arr[j];
            if (arr[j] < coldest) coldest = arr[j];
        }
        arr2[0] = hottest;
        arr2[1] = coldest;
        return arr2;
    }
}