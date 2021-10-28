package Question1;

public class Cat {
	private String name;
	private Breed breed;
	private double weight;
	public Cat(String name, Breed breed, double weight){
	this.name = name;
	this.breed = breed;
	this.weight = weight;
	}
	public Breed getBreed() {
	return breed;
	}
	public double getWeight() {
	return weight;
	}
	//other accessors and mutators
}
