package Collections;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    /*
    * Before Collection Framework, Stadard methods for grouping java objects ==> Arrays, Vectors, Hashtables,
    * All of these collections has no common interface, ===> its diffucult to remember all methods, syntax.
    *
    * its Difficult to write an algorithme that can work for all kinds of collections,
    * the most of methods for Vector are final ===> we cannot extend Vector class to implement a similar kind.
    *
    * The collection framework contains an interface named an iterable interface which provide an iterator to iterate,
    * through all the collections, this interface is extended by the main collection [Root].
    *
    * Interfaces:
     * 1.Iterable interface: Root interface for the entire Collection Framework.
     *       All interfaces and classes implement this interface
     *       Iterator iterator();
     *
     * 2.Collection Interface: extends the Iterable Interface,
     *       is implemented by all the classes in the Collection Framework.
     *       adding, removing, clearing ==> implemented in this interface
     *
     * The collection framework contains multiple interfaces,every interface is used to store a specific type of data.
    * */
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        //Adding elements to the vector
        v.addElement(1);
        v.addElement(10);

        //Adding elements to the hashtable
        h.put(1, "oussama");
        h.put(2, "bougattaoui");

        //Accessing elements:
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}
