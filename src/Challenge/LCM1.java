import java.util.Scanner;

public class LCM1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int lcm = findLCM(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

        input.close();
    }

    // Function to compute GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to compute LCM
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
