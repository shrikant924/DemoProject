package Practice.collectionframeworksInJava;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<Integer,String> map=new java.util.HashMap<>();
        map.put(1,"Shrikant");
        map.put(2,"Anand");
        map.put(3,"Krishna");
        map.put(4,"Raj");
        map.put(5,"Shreya");
        map.put(6,"Sujata");

      //  System.out.println(map.get(2));

        for (int i = 1; i <= map.size(); i++) {

            System.out.println(map.get(i));
        }
    }
}
