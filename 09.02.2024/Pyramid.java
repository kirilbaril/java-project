public class Pyramid extends Shape{
    private double baseArea;
    private double height;
    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }
    @Override
    double calculateVolume() {
        return 1d/3*baseArea*height;
    }

    @Override
    double calculateSurfaceArea() {
        return 0;
    }
}
