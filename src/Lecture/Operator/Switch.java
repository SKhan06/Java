package Lecture.Operator;

public class Switch {
    public static void main(String[] args) {
        int day =5;

        newSwitch(day);

    }
    public static void newSwitch(int day){
        String dayStr = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Invalid";
        };
        System.out.println(dayStr);;

    }
}
