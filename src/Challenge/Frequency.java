package Challenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,7,4,3,7,8,6,8,9,4,3);
        System.out.println(Collections.frequency(list,3));
        System.out.println(Collections.frequency(list,8));
        System.out.println(Collections.frequency(list,7));
    }
}
