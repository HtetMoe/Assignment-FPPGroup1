package assignment2.problem5;

final public class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea(){
        return 0.5*base*height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
