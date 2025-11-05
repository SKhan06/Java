package Challenge;

import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre a Number");
        int num = input.nextInt();
        OddEvenTernary check = new OddEvenTernary();
        String oddEven = check.oddEven(num);
        System.out.println(oddEven);
    }
    public String oddEven(int num){
        String result = num%2==0 ? "Even":"Odd";
        return result;

    }

}
