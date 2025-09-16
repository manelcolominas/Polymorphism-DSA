// public class Square extends Rectangle{
//    double side;

//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }

//    @Override
//    public double calculateArea() {
//        double area = (side*side);
//        return area;
//    }
//}

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side); // Square has equal length and width
    }

    @Override
    public double calculateArea() {
        // length and width are equal, so this is fine:
        return super.calculateArea();
    }
}

