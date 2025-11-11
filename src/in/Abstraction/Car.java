package in.Abstraction;

public class Car extends Vehicle{
    private int noOfDoor;
    @Override
    public void carStartSound() {
        System.out.println("vrooo....");
    }
    public void getSetGo(){
        System.out.println("going to place.....");
    }



    public Car(){
        super(4);
    }
}
