//Rectangle.java
public class Rectangle extends Shape {
    double base;
    double height;

    public Rectangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double area() {
        return (base*height);
    }
}
