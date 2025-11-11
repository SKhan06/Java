package Challenge.Abstraction;

public class Square extends Shape{
    private double sideInCms;

    public  Square(double sideInCms){
        this.sideInCms = sideInCms;

    }
    public double calculateArea(){
        return Math.pow(sideInCms,2);
    }
}
