package in.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        vehicles.commute();
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();
        twoWheeler.balance();
        MotorVehicle motorVehicle = new MotorVehicle();
        motorVehicle.commute();
        motorVehicle.start();
        motorVehicle.balance();

    }
}
