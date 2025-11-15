package in.enums;

public class TestingEnums {
    public static void main(String[] args) {

        TrafficLight color = TrafficLight.RED;
        color = TrafficLight.GREEN;
        Grade grade = Grade.valueOf("E");

        for(Grade value :Grade.values()){
            System.out.println(value);
        }
        for (TrafficLight cl :TrafficLight.values()){
            System.out.printf("%s %s\n",cl,cl.getType());
        }

    }
}
