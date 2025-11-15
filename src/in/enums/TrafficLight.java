package in.enums;

public enum TrafficLight {
    RED ("stop") ,GREEN ("start") , YELLOW ("slow down");
    private  final  String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public  String getAction(){
        return action;
    }
    public String getType(){
        return getAction();
    }


}
