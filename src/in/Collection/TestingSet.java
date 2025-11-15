package in.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Sohail"));
        System.out.println(names.add("Khan"));
        System.out.println(names.add("Muhammad"));
        System.out.println(names.add("Sohail"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.remove("Sohail"));
        System.out.println(names.contains("Sohail"));
        Utility.print(names);


    }
}
