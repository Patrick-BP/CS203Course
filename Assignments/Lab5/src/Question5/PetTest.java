package Question5;

import java.util.ArrayList;
import java.util.List;

public class PetTest {
    public static void main(String[] args) {
        Pet p1= new Pet("Tod",'c');
        Pet p2= new Pet("miao",'d');
        Pet p3= new Pet("titi",'d');
        Pet p4= new Pet("toto",'c');
        List<Pet> pets= new ArrayList<>();
        pets.add(p1);
        pets.add(p2);
        pets.add(p3);
        pets.add(p4);
        System.out.println(pets);
    }

}
