//Rectangle.java
public class Rectangle extends Shape{
    double base;
    double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (base*height);
        return area;
    }
}