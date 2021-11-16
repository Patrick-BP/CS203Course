import java.io.Serializable;

public class Car implements java.io.Serializable {
	
	private String make;
	private String model;
	private int year;
	private double weight;
	private String color;
	
	public Car(String make, String model, int year, double weight, String color) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.weight = weight;
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public double getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		return "make:                          " + make +
				"\nmodel:                      " + model +
				"\nyear:                       " + year +
				"\nweight:                     " + weight +
				"\ncolor:                      " + color;
	}
	
	
	

}
