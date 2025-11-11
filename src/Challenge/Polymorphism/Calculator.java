package Challenge.Polymorphism;

public class Calculator {

    public  int add(int a, int b){
        return a + b;
    }
    public int add(int a,int b,int c, int d){
        return a + b + c + d;
    }
    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        double calculate = calculator.add(4,8);
//        System.out.println(calculate);
        System.out.println(calculator.add(3,5));
        System.out.println(calculator.add(3,5,3,9));
        System.out.println(calculator.add(3.8,5.5));
    }
}
