//Shape.java
public abstract class Shape implements Comparable<Shape> {
    public abstract double area();
    public int compareTo(Shape o) {
        return Double.compare(this.area(), o.area());
    }
}
