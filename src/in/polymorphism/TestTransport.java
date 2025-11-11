package in.polymorphism;

public class TestTransport {
    public static void main(String[] args) {
        Car c = new Car();
        Plane p = new Plane();
//        castTest(v);
        castTest(c);
        castTest(p);
    }

    public static void castTest(Vehicle vch){
//        vch.start();
//        Car cVehicles = (Car) vch;
//       ((Car) vch).noOfDoor();
//        cVehicles.start();
        vch.start();
    }
}
