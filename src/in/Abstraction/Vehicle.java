package in.Abstraction;

public abstract class Vehicle implements Transport{
    private int noOfVehicles;
    Vehicle(int noOfVehicles){
        this.noOfVehicles=noOfVehicles;
    }

    public abstract void carStartSound();
    public int getNoOfVehicles(int noOfVehicles){
        return noOfVehicles;
    }
    public void setNoOfVehicles(int noOfVehicles){
        this.noOfVehicles=noOfVehicles;
    }

    public void commute(){
        System.out.println("going......");
    }



}
