package Challenge.Abstraction;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Square square = new Square(22);
        System.out.printf("Area of circle is %f \n",circle.calculateArea());
        System.out.printf("Area of circle is %f \n",square.calculateArea() );

    }
}
