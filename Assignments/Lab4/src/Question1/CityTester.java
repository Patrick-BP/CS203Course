package Question1;
import java.util.*;

public class CityTester {
    public static void main(String[] args) {
        Comparable city1 = new City("Dallas", 90.5);
        Comparable city2 = new City("Fairfield", 50.4);
        Comparable city3 = new City("Nevada", 70.5);



        List<Comparable> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);

        Collections.sort(cities);
        System.out.println(cities);


    }
}
