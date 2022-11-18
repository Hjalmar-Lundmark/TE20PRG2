package ObjectTesting;

public class Cube extends Square{
    private double z;

    public Cube(double side) {
        super(side);
        this.z = side;
    }

    public Cube(String color, boolean filled, double side) {
        super(color, filled, side);
        this.z = side;
    }

    public double getSide() {
        return z;
    }

    public void setCubeSide(double z) {
        this.z = z;
        this.setSide(z);
    }

    public double getVolume() {
        return (z*z*z);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + z +
                "color=" + this.getColor() +
                "filled=" + this.isFilled() +
                '}';
    }
}
