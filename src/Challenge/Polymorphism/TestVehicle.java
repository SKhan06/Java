package Challenge.Polymorphism;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        car.service();
        vehicle.service();
    }
}
