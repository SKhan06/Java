package Challenge.kgcoding.CircleRectangle.utils;

import Challenge.kgcoding.CircleRectangle.geometry.Circle;
import Challenge.kgcoding.CircleRectangle.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(10.2);
        Rectangle rect = new Rectangle(15,33);
        double cirArea = Math.PI * Math.pow(circle.radius, 2);
        double rectArea =rect.length * rect.breath;
        System.out.printf("Area of the circle is : %f, Area of the rectangle : %f",cirArea,rectArea);
    }
}
