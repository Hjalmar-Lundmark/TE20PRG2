package ObjectTesting;

public class Square extends Rectangle2{
    private double side;

    public Square() {

    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side2) {
        this.side = side2;
        this.setH(side2);
        this.setW(side2);
    }

    public void setLength(double side2) {
        this.side = side2;
        this.setH(side2);
        this.setW(side2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "color=" + this.getColor() +
                "filled=" + this.isFilled() +
                '}';
    }
}
