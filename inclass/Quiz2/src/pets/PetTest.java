package pets;

import java.util.*;

public class PetTest {
	public static void main(String[] args) {
		List<Pet> pets = new ArrayList<Pet>();
		Pet p1 = new Pet("Marko",5, 10);
		Pet p2 = new Pet("Polo", 4, 20);
		Pet p3 = new Pet("Kitty", 3, 7);
		
		pets.add(p1);
		pets.add(p2);
		pets.add(p3);

		for(Pet p : pets) {
			System.out.println(p);
		}
		
		for(int i = pets.size()-1; i > -1; i--) {
			System.out.println(pets.get(i));
		}
	}
}
