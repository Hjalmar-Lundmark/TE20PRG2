package ObjectTesting;

public class Circle {
    private double radie = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radie) {
        this.radie = radie;
    }

    public Circle(double radie, String color) {
        this.radie = radie;
        this.color = color;
    }

    public double getRadius() {
        return radie;
    }

    public void setRadius(double radie) {
        this.radie = radie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radie=" + radie +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        return (radie*radie*Math.PI);
    }

    public double getCircumference() {
        return (radie*Math.PI*2);
    }
}
