package src.Ex23;

public class Circle extends Shape {
    private double r;
    @Override
    double calcArea() {
        return Math.PI*r*r;
    }

    public Circle(double r) {
        super();
        this.r = r;
    }

    public Circle(Point p, double r) {
        super(p);
        this.r = r;
    }
}
