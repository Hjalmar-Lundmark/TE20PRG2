package ObjectTesting;

public class point3D extends point2D{
    private float z = 0.0f;

    public point3D(float z) {
        super();
        this.z = z;
    }

    public point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(int o, int p, int q) {
        setX(o);
        setY(p);
        this.z = q;
    }

    public float[] getXYZ() {
        float[] f = {getX(), getY(), getZ()};
        return f;
    }

    @Override
    public String toString() {
        return "Punkten: " + '(' + super.getX() + ',' + super.getY() + ',' + z + ')';
    }
}
