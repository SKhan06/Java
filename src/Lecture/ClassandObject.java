package Lecture;

public class ClassandObject {
    // Car
    int noOfWheel;
    String color;
    float maxSpeed;
    int  noOfSeat;
    float currentFuelInLitre;

    public void drive(){
        System.out.println("Car is Drive");
        currentFuelInLitre--;
    }

    public void addFuel(float fuel){
        currentFuelInLitre +=fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLitre;
    }
}


