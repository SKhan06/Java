package Challenge;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month Switch \n");
        System.out.println("Entre your month Number");
        int month = input.nextInt();
        String monthName= getMonthName(month);
        System.out.println("Your month name is"+monthName);
    }

    public static String getMonthName(int month){
        return switch (month){
            case 1-> "January";
            case 2-> "Feb";
            case 3-> "March";
            case 4-> "April";
            case 5-> "May";
            case 6-> "June";
            case 7-> "July";
            case 8-> "August";
            case 9-> "September";
            case 10-> "Octuber";
            case 11-> "November";
            case 12-> "December";
            default -> "Invalid";
        };

    }
}
