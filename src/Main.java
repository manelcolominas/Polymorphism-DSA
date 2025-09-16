//Main.java
public class Main {

    public static void main(String[] args) {
        Shape[] v = new Shape[5];

        v[0] = new Rectangle( 5,10);
        v[1] = new Circle(5);
        v[2] = new Rectangle(5,10);
        v[3] = new Circle(120);
        v[4] = new Square(100);

        double res = Shape.sumArea(v);

        System.out.println("sum: " + res);
    }
}