package ObjectTesting;

public class Circle2 extends Shape{
    private double radius = 1.0;

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle2() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius*radius*Math.PI);
    }

    public double getPerimeter() {
        return (radius*Math.PI*2);
    }

    @Override
    public String toString() {
        return "Circle2{radius=" + radius + " color=" + this.getColor() + " filled=" + this.isFilled() +
                '}';
    }
}
