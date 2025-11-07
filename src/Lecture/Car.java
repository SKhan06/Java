package Lecture;

public class Car {
    int noOfWheels;
    int noOFDoor;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOFDoor, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOFDoor = noOFDoor;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOFDoor=").append(noOFDoor);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car thar = new Car(4,4,120,"Thar","sadc234","Mahindra");
        System.out.println(thar.toString());
    }



}
