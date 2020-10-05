package src.Ex22;

public class Cricle extends Shape {
    private double r;
    @Override
    double calcArea() {
        return Math.PI*r*r;
    }

    public Cricle(double r) {
        super();
        this.r = r;
    }

    public Cricle(Point p, double r) {
        super(p);
        this.r = r;
    }
}
