package Challenge.Enum.enums;

public enum Day {
    MONDAY (true)  ,
    TUESDAY (true),
    WEDNESDAY (true),
    THURSDAY (true),
    FRIDAY (true),
    SATURDAY (false) ,
    SUNDAY (false);

    private final boolean isWeakday;

    Day(boolean isWeekday) {
        this.isWeakday = isWeekday;
    }

    public String getTypes(){
        return isWeakday ? ": Weekday" : ": Weekend";
    }
}
