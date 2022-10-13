package Practice.collectionframeworksInJava;

import java.util.HashSet;
import java.util.Set;

public class Sett {

    public static void main(String[] args) {

        Set<Object> obj=new HashSet<>();
        obj.add("shrikant");
        obj.add("shrikant");
        obj.add("Ajit");
        obj.add("praj");
        obj.add("Zebra");
        obj.add(4);
        obj.add(3);


       // obj.add(4);
        System.out.println(obj);

        System.out.println();
    }
}
