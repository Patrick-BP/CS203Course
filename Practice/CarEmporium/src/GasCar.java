
public class GasCar extends Car{
	private double tankSize;
	private String fuelType;
	
	
	public GasCar(String make, String model, int year, double weight, String color, double tankSize, String fuelType) {
		super(make, model, year, weight, color);
		this.tankSize = tankSize;
		this.fuelType = fuelType;
	}


	public double getTankSize() {
		return tankSize;
	}


	public String getFuelType() {
		return fuelType;
	}


	@Override
	public String toString() {
		return  super.toString() + "  tankSize: " + tankSize + ",   fuelType: " + fuelType ;
	}



}
