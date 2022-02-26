package Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    /*
    * is an ordered version of HashSet ==> maintains a doubly-linked list across all elements
    * using when we need order.
    * contains only unique elements.
    * Constructors:
    *          LinkedHashSet<E> hs = new LinkedHashSet<E>();
               LinkedHashSet<E> hs = new LinkedHashSet<E>(Collection c);
                LinkedHashSet<E> hs = new LinkedHashSet<E>(int size);
     */
    public static void main(String[] args) {
        LinkedHashSet<String> h = new LinkedHashSet<String>();
        //Adding elements:
        h.add("Geeks");
        h.add("For");
        h.add("Geeks");
        h.add("oussama");
        h.add("Bougattaoui");
        System.out.println(h);

        //Removing elements
        h.remove("Geeks");//return False if it is not exist

        //Iterating:
        Iterator itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
