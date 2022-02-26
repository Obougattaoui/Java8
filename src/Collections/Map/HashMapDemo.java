package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    /*
    * Map interface represents a mapping between a key and a value
    * The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently from the rest of the collection types.
    * Map such as dictionaries
    * Cannot contain duplicate keys
    * allow null key and null values(but TreeMap not)
    * TreeMap and LinkedHashMap have predictable orders while HashMap does not
    *
    * HashMap : uses a technique called Hashing. Hashing is a technique of converting a large String to a small String,
    *  that represents the same String. A shorter value helps in indexing and faster searches

    * LinkedHashMap is just like HashMap with an additional feature of maintaining an order of elements inserted into it.
    * HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order.
    *
    * The TreeMap in Java is used to implement the Map interface and NavigableMap along with the Abstract Class. The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used
    *
     * */
    public static void main(String[] args) {

        //Create an empry HashMap:
        Map<String, Integer> map = new HashMap<>();

        //Adding elements: No order
        map.put("oussama", 10);
        map.put("Kahlaoui", 20);
        map.put("bougattaoui", 30);
        map.put("For", 50);

        //Printing the size of the map:
        System.out.println("the size is " + map.size());

        //Printing the map:
        System.out.println(map);

        //Changing elements:
        map.put("oussama", 10000);
        
        //Printing:
        System.out.println("Updated map: " + map);

        //Removing elements:
        map.remove("For");

        //Printing:
        System.out.println("After removing: " + map);

        //Iterating:
        /*
        * since Iterators work with one type of data we use Entry<?, ?> to resolve the two separate types into a compatible format
        * */
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println("Key: " + e.getKey() + " , Value: " + e.getValue());
        }
        /*
        * Performance of HashMap
            Performance of HashMap depends on 2 parameters which are named as follows:
                    Initial Capacity
                    Load Factor
            1. Initial Capacity – It is the capacity of HashMap at the time of its creation (It is the number of buckets a HashMap can hold when the HashMap is instantiated). In java, it is 2^4=16 initially, meaning it can hold 16 key-value pairs.

            2. Load Factor – It is the percent value of the capacity after which the capacity of Hashmap is to be increased (It is the percentage fill of buckets after which Rehashing takes place). In java, it is 0.75f by default, meaning the rehashing takes place after filling 75% of the capacity.

            3. Threshold – It is the product of Load Factor and Initial Capacity. In java, by default, it is (16 * 0.75 = 12). That is, Rehashing takes place after inserting 12 key-value pairs into the HashMap.

            4. Rehashing – It is the process of doubling the capacity of the HashMap after it reaches its Threshold. In java, HashMap continues to rehash(by default) in the following sequence – 2^4, 2^5, 2^6, 2^7, …. so on.
        * */

        /*
        * HashMap is unsynchronized i.e. multiple threads can access it simultaneously. If multiple threads access this class simultaneously and at least one thread manipulates it structurally then it is necessary to make it synchronized externally.
        * */
    }
}
