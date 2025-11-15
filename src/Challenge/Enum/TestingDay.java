package Challenge.Enum;


public class TestingDay {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        for(Day day : Day.values()){
            System.out.println(day);
        }

    }
}
