package Challenge.NestedProblem.ArrayStatic;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations opp = new ArrayOperations(new int[]{1,3,45});
        ArrayOperations.Statistic statistic= opp.new Statistic();
        System.out.println(statistic.mean());
    }
}
