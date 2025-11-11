package in.Encapsulation.Accessmodified;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Thar";
        car.color = "Red";
        Car newCar = new Car("Thar","red",13243,1,10000);
        car.modelNumber= 34567;
        System.out.println(car);
        System.out.println(newCar);
    }
}
