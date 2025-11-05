package Challenge;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to calculator Switch\n");
        System.out.println("Entre your First Number");
        int num1 = input.nextInt();
        System.out.println("Now, Entre your Second Number");
        int num2 = input.nextInt();
        System.out.println("Now, Your entre operation :");
        String operation = input.next();

        int result = switch (operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "%" -> num1 % num2;
            case "/" -> num1 / num2;
            case "*" -> num1 * num2;
            default -> -1;
        };
        System.out.println(result);

    }
}
