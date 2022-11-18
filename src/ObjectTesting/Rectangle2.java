package ObjectTesting;

public class Rectangle2 extends Shape{
    private double h = 1.0;
    private double w = 1.0;

    public Rectangle2() {

    }

    public Rectangle2(double h, double w) {
        this.h = h;
        this.w = w;
    }

    public Rectangle2(String color, boolean filled, double h, double w) {
        super(color, filled);
        this.h = h;
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getArea() {
        return (w*h);
    }

    public double getPerimeter() {
        return ((w*2) + (h*2));
    }

    @Override
    public String toString() {
        return "Rectangle2{" +
                "h=" + h  +
                ", w=" + w +
                "color=" + this.getColor() +
                "filled=" + this.isFilled() +
                '}';
    }
}
