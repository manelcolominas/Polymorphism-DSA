//Shape.java
public abstract class Shape {

    public abstract double calculateArea();

    public static double sumArea(Shape[] v) {
        double sum = 0;
        for (Shape s : v) {
            sum += s.calculateArea();
        }
        return sum;
    }
}
