package in.Abstraction;

import java.util.concurrent.Callable;

public class TestAbstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.carStartSound();
        car.commute();

    }
}
