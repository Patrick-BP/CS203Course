package Question1;

public class Q1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Breed persian = new Breed("Persian", 10.0);
		Cat chacha = new Cat("Cha Cha", persian, 12.0);
		Cat bombom = new Cat("Bom Bom", "mix", 10.0); //<==== 1. breed parameter must be an object of type Breed  not a string
		Cat puffpuff = new Cat("Puff Puff", chacha, 9.0); // <===== 2. the second parameter must be an object type breed
		double diff = chacha.getWeight()
		- persian.getWeight();
	//	System.out.println(
		//puffpuff.getBreed().getWeight());
		//}

	}

}
