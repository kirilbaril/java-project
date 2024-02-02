public class Triangle extends Shape{

    private double A;
    private double B;
    private double C;
    public Triangle(double a, double b, double c) {
        A = a;
        B = B;
        C = c;
    }
    @Override
    public double getArea() {
        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
