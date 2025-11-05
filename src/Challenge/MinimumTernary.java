package Challenge;

import java.util.Scanner;

public class MinimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre your First Number");
        int num1 = input.nextInt();
        System.out.println("Now, Entre your Second Number");
        int num2 = input.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1,num2);
        System.out.println("Minimum number :"+min);
    }
    public int min(int num1,int num2){
        return  num1<num2 ? num1:num2;
    }
}
