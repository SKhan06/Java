package in.polymorphism;

public class Car implements Vehicle{
    public  int noOfDoor(){
        return 5;
    }

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }
}
