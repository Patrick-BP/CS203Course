package Question1;
import java.util.*;

public class CityTester {
    public static void main(String[] args) {
        City city1 = new City("Dallas", 90.5);
        City city2 = new City("Fairfield", 50.4);
        City city3 = new City("Nevada", 70.5);

        City[] citiesList = new City[3];
        citiesList[0] = city1;
        citiesList[1] = city2;
        citiesList[2] = city3;

        Arrays.sort(citiesList);
        System.out.println(Arrays.toString(citiesList));


    }
}
