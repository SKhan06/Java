package Challenge.Interface;

public abstract class Bird implements Flyable{
    private final int noOfFeathers;

    public Bird(int noOfFeathers) {
        this.noOfFeathers = noOfFeathers;
    }

    public int getNoOfFeathers() {
        return noOfFeathers;
    }
}
