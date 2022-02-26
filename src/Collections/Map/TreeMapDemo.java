package Collections.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    /*
    * SortedMap interface : provides a total ordering of its elements(keys)
    * null key or null value is not permitted
    * The keys are sorted either by natural ordering or by a specified comparator.
    *
    * TreeMap is an implementation of the SortedMap interface
    * TreeMap uses a tree Data Structure for storage
    * TreeMap implement MapInterface and NavigableMap
    * is not Synchronized
    * Each node in the tree has:

3 Variables (K key=Key, V value=Value, boolean color=Color)
3 References (Entry left = Left, Entry right = Right, Entry parent = Parent)
*
* Constructors:
*           TreeMap()
*           TreeMap(Comparator c)
*           TreeMap(Map M)
*           TreeMap(SortedMap sm)
*
     * */

    public static void main(String[] args) {

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        //Adding elements to the TreeMap:
        tm.put(3, "oussama");
        tm.put(2, "bougattaoui");
        tm.put(4, "oumnia");
        tm.put(1, "ensa");

        //Printing elements:
        System.out.println(tm);

        //Changing elements:
        tm.put(1, "khouribga");

        //Printing elements:
        System.out.println(tm);

        //Removing elements:
        tm.remove(3);

        //Printing elements:
        System.out.println(tm);

        //Iterating:
        for (Map.Entry map: tm.entrySet()){
            System.out.println("Key: " + map.getKey() + " ,Value: " + map.getValue());
        }
    }
}
