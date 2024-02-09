public class Sphere extends Shape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
