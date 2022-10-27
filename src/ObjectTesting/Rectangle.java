package ObjectTesting;

public class Rectangle {
    private float l1 = 1.0f;
    private float w1 = 1.0f;

    public Rectangle(float l1, float l2) {
        this.l1 = l1;
        this.w1 = l2;
    }

    public float getL1() {
        return l1;
    }

    public void setL1(float l1) {
        this.l1 = l1;
    }

    public float getW1() {
        return w1;
    }

    public void setW1(float w1) {
        this.w1 = w1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l1=" + l1 +
                ", l2=" + w1 +
                '}';
    }

    public double getArea() {
        return (l1*w1);
    }

    public double getperimeter() {
        return (l1+l1+w1+w1);
    }
}
