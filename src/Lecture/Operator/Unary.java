package Lecture.Operator;

public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);

        int a = 5;
        a = a +1;
        System.out.println(a);
        a+= 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);


        int p = 9;
        System.out.println(--p);
        System.out.println(p--);
        System.out.println(p);
    }
}
