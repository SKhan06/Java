package Lecture;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First");
        sb.append( 78);
        sb.append(", Now this is the");
        sb.append(23.3);
        sb.toString();
        System.out.println(sb);
    }

}
