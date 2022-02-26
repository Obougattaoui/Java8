package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    /*
    * maintain an order of elements inserted into it
    * the elements can be accessed in their insertion order.
    * it is non-synchronized
    * the data is stored in the form of nodes. the implementation is very similar to a doubly-linked list
    *               Previous(contains the adress to the previous node) Key Value Next(the adress to the next node)
    * Hash: All the input keys are converted into a hash which is a shorter form of the key so that the search and insertion are faster.
    *
    * Constructors
    *       LinkedHashMap<K, V>()
    *       LinkedHashMap<k,v> (int capacity)
    *       LinkedHashMap(Map<? extends K, ? extends V> map): It is used to initialize a particular LinkedHashMap with the elements of the specified map.
    *       LinkedHashMap(int capacity, float fillRatio) is a metric that determines when to increase the size of the LinkedHashMap automatically. By default, this value is 0.75
    *       LinkedHashMap(int capacity, float fillRatio, boolean Order) ==> with follow order or not
    *
    *
     * */

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        //Adding elements:
        lhm.put(3, "Geeks");
        lhm.put(2, "For");
        lhm.put(1, "Geeks");

        //Printing elements:
        System.out.println(lhm);

        //Changing elements:
        lhm.put(2, "oussama");

        //Printing elements:
        System.out.println(lhm);

        //Removing elements:
        lhm.remove(1);

        //Printing elements:
        System.out.println(lhm);

        //Iterating:
        for(Map.Entry<Integer, String> map: lhm.entrySet()){
            System.out.println("Key: " + map.getKey() + " Value: " + map.getValue());
        }
        System.out.println(lhm.get(2));

        //size of the LinkedHashMap:
        System.out.println(lhm.size());

        //Check the existing of a specific value:
        System.out.println("contains bougattaoui: " + lhm.containsValue("bougattaoui"));

        //Check the existing of a specific key:
        System.out.println("Contains 10: " + lhm.containsKey(10));


    }

}
