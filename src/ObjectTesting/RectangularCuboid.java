package ObjectTesting;

public class RectangularCuboid extends Rectangle2{
    private double z;

    public RectangularCuboid() {

    }

    public RectangularCuboid(double z) {
        this.z = z;
    }

    public RectangularCuboid(double h, double w, double z) {
        super(h, w);
        this.z = z;
    }

    public RectangularCuboid(String color, boolean filled, double h, double w, double z) {
        super(color, filled, h, w);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getVolume() {
        return (z*this.getH()*this.getW());
    }

    @Override
    public String toString() {
        return "RectangularCuboid{" +
                "x=" + this.getW() +
                "y=" + this.getH() +
                "z=" + z +
                "color=" + this.getColor() +
                "filled=" + this.isFilled()+
                '}';
    }
}
