package Practice.Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSet {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("shrikant");
        list.add("shrikant");
        list.add("hasd");
        list.add("shrikant");
        list.add("sdjk");
        list.add("shrikant");
        list.add("asdj");

        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("#############################################################################");
        Set<String> set = new HashSet<>(list);
        for (String s:set
             ) {

            System.out.println(s);
        }
    }
}
