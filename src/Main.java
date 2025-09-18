import java.util.Arrays;

//Main.java
public class Main {

    public static void main(String[] args) {
        Shape[] v = new Shape[5];

        v[0] = new Rectangle( 5,10);
        v[1] = new Circle(5);
        v[2] = new Rectangle(5,10);
        v[3] = new Circle(120);
        v[4] = new Square(100);

        double res = sum(v);
        System.out.println("sum: " + res);

        print(v);
        sort(v);
        print(v);
    }

    public static double sum(Shape[] s){
        double sum = 0;
        for(Shape s1 : s){
            sum += s1.area();
        }
        return sum;
    }

    public static void sort(Shape[] s){
        Arrays.sort(s);
    }

    public static void print(Shape[] sh) {
        for (int i = 0; i < sh.length; i++) {
            System.out.print("area: " + sh[i].area() + "\n");
        }
        System.out.println("----\n");
    }
}
