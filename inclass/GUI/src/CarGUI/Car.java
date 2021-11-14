package CarGUI;

import java.io.Serializable;

public class Car implements Serializable{
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return "make=" + make + ", model=" + model + ", year=" + year;
	}
	
	
}
