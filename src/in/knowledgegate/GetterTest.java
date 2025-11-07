package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Frrari","pink",123,1,1000);
        System.out.printf("%s %s",car.getName(),car.getColor());
    }
}
