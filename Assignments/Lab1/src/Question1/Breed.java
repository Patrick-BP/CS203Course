package Question1;

public class Breed {
	private String name;
	private double averageWgt; //in lbs.
	public Breed(String name, double averageWgt){
	this.name = name;
	this.averageWgt = averageWgt;
	}
	public double getWeight( ) {
	return averageWgt;
	}
	//other accessors and mutators

}
