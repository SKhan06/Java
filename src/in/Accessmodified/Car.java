package in.Accessmodified;

public class Car {
    public String name;
    public String color;
    public int modelNumber;
    private int fuel;
    private int carOfPurchase;

    Car(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", modelNumber=").append(modelNumber);
        sb.append(", fuel=").append(fuel);
        sb.append(", carOfPurchase='").append(carOfPurchase).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Car(String name, String color, int modelNumber, int fuel, int carOfPurchase) {
        this.name = name;
        this.color = color;
        this.modelNumber = modelNumber;
        this.fuel = fuel;
        this.carOfPurchase = carOfPurchase;
    }
}
