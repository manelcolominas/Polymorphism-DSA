//Triangle.java
public class Triangle extends Shape{
    private double base, height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double area() {
        return (base*height)/2;

    }
}
