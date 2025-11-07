package Challenge;

public class DiceRoll  {
    int roll(){
        double random =Math.ceil(Math.random() * 6);
        return (int)random;
    }

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        for (int i = 0; i < 1000; i++) {
            System.out.println(dice.roll());
        }
    }
}
