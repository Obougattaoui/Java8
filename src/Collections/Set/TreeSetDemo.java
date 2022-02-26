package Collections.Set;

import com.sun.source.tree.Tree;

import java.util.*;

/*
* SortedSet:
*  It is an interface that implements the mathematical set. This interface contains the methods inherited from the Set interface
* and adds a feature that stores all the elements in this interface to be stored in a sorted manner.
*  the navigable set interface provides the implementation to navigate through the Set. The class which implements the navigable,
*  set is a TreeSet which is an implementation of a self-balancing tree.
*
 * */
public class TreeSetDemo {
    /*
    * TreeSet Class is the implementation of the SortedSet Interface
    * it is like a simple set that it stores elements in a sorted format
    * uses a Tree data structure for storage
    * Ascending order but we can iterate in descending order
    * SortedSet implements Comparable interface
    *
    * NavigableSet inherits from the SortedSet interface,
    * it behaves like a SortedSet with the exception that we have
    * navigation methods available in addition to the sorting mechanism
    *   Can navigate the set in reverse order compared to the order defined in SortedSet
    *   A NavigableSet may be accessed and traversed in either ascending or descending order
    *
    * */
    public static void main(String[] args) {
        //Create a set of string
        SortedSet<String> ts = new TreeSet<String>();

        //Adding elements to the set:
        /*the insertion order is not retaibed in the TreeSet
        the values are compared and sorted in the ascending order.

        * */
        ts.add("oussama");
        ts.add("bougattaoui");
        ts.add("oumnia");
        ts.add("ensa");
        ts.add("a");

        //Displaying the tree:
        System.out.println(ts);

        //Accessing elements:
        System.out.println("********************Accessing elements**************");
        System.out.println("contains " + ts.contains("a"));
        System.out.println("The first element is " + ts.first());
        System.out.println("The last element is "  + ts.last());

        //Removing element:
        ts.remove("a");

        //Iterating:
        Iterator<String> i = ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // NavigableSet
        NavigableSet<Integer> ns = new TreeSet<Integer>();

        //Adding elements:
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        //Get the set in reverse order
        NavigableSet<Integer> reverseNs = ns.descendingSet();

        System.out.println("Normal orser " + ns);
        System.out.println("In reverse order " + reverseNs);

        //Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
        NavigableSet<Integer> threeOrMore = ns.tailSet(3, true);
        System.out.println("Three or more: " + threeOrMore);

        System.out.println("Lower than 3: " + ns.lower(3));
        System.out.println("floor(3): " + ns.floor(3));
        System.out.println("higher(3): " + ns.higher(3));
        System.out.println("ceiling(3): " + ns.ceiling(3));

        //Removing elements: remove()/ pollFirst()/ pollLast()
        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("pollLast(): " + ns.pollLast());

        /*
        * TreeSet is basically an implementation of a self-balancing binary search tree like a Red-Black Tree.
        * Therefore operations like add, remove, and search takes O(log(N)) time. The reason is that in a self-balancing tree,
        * it is made sure that the height of the tree is always O(log(N)) for all the operations.
        * Therefore, this is considered as one of the most efficient data structures in order to store
        * the huge sorted data and perform operations on it.
        * However, operations like printing N elements in the sorted order take O(N) time.
        * Constructors:
        *            TreeSet() ==> an empty TreeSet
        *            TreeSet(Comparator c) ==> elements need an external specification of the sorting order.
        *            TreeSet(Collection collection)
        *           TreeSet t = new TreeSet(SortedSet s)
         * */

        /*
        * If we are depending on the default natural sorting order, the objects that are being inserted into the tree should be
        * homogeneous and comparable. TreeSet does not allow the insertion of heterogeneous objects.
        * The TreeSet can only accept generic types which are comparable.
         * */
    }
}
