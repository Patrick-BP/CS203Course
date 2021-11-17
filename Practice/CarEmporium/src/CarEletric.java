
public class CarEletric extends Car{
	private double batterySize;
	private String batteryType;
	public CarEletric(String make, String model, int year, double weight, String color, double batterySize,
			String batteryType) {
		super(make, model, year, weight, color);
		this.batterySize = batterySize;
		this.batteryType = batteryType;
	}
	public double getBatterySize() {
		return batterySize;
	}
	public String getBatteryType() {
		return batteryType;
	}
	@Override
	public String toString() {
		return   super.toString() +"\n" + 
				"Battery Size: " + batterySize + "\n"+
				"Battery Type: " + batteryType +"\n"+

				"\n___________________________________________";
	}
	

}
