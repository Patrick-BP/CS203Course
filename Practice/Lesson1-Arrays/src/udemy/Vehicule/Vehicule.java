package udemy.Vehicule;

public class Vehicule {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicule(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicule.steer() : steering at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity= velocity;
        currentDirection = direction;
        System.out.println("vehicule.move() : moving at " + currentVelocity + "in direction" + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
