package udemy.Vehicule;

public class Car extends Vehicule{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changerGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear()");
    }
}
