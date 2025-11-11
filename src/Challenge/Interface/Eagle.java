package Challenge.Interface;

public class Eagle extends Bird{
    public Eagle(){
        super(2);
    }
    @Override
    public void fly() {
        System.out.println("Eagle is  fly...");
    }
}
