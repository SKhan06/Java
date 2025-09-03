package production;

public class Parameter {
    public static void main(String[] args) {
        int add = sumTwoNumber(4 ,5);
        System.out.println("Total Number : " +add);


    }

    public static int sumTwoNumber(int first, int second){
        System.out.println("First Number : " +first);
        System.out.println("Second Number : " +second);
        int sum = first + second;

        return sum;
    }

}

