package Question2;

public class Circle implements Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius, 2)* Math.PI;
    }
}
