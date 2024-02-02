public class Circle extends Shape{
    private double R;
    private final double PI = Math.PI;
    public Circle(double R) {
        this.R = R;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(R, 2d); // 2, 2.0, 2d
    }
}
