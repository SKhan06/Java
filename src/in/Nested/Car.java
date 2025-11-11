package in.Nested;

public class Car {
    private  int noOfDoor;

    public void repair(){
        Tire t = new Tire();

    }
    protected class Tire{
        private double width;
        private double pressure;
        private String material;
    }
    public void inflate(){
        noOfDoor = 4;
    }
}
