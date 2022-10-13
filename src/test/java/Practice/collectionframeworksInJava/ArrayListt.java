package Practice.collectionframeworksInJava;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {

    /*The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate
    element of different data types. The ArrayList class maintains the insertion order and is
        non-synchronized. The elements stored in the ArrayList class can be randomly accessed.*/
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(100);
        list.add(23);
        list.add(344);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
        list.add(323);
list.remove(3);


        System.out.println(list.size());

//        for (int a:list
//             ) {
//            System.out.println("\n"+a);
//
//        }
//

            System.out.println(list);
           // list.removeAll(list);
           // System.out.println(list);
            list.set(1,34);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.clear();
        System.out.println(list);


    }
}
