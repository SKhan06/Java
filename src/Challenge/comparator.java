package Challenge;

import Lecture.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Lion","Zebra","Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }
    public static void sortInDescending(List<String> stringList){
//        Collections.sort(stringList);
//        Collections.reverse(stringList);
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s, String t2) {
                if (s.equals(t2)){
                    return 0;
                } else if (s.charAt(0)< t2.charAt(0)) {
                    return 1;
                }else {
                    return -1;
                }

            }
        });


    }
}
