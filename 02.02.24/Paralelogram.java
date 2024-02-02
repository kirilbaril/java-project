public class Paralelogram extends Shape {
    private double height;
    private double weight;
    public Paralelogram(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return height * weight;
    }
}
