package Collections.Set;

import java.util.*;

public class HashSetDemo {
/*
* Set is unordered collection of objects in which duplicate values cannot be stored.
* HashSet ==> class, Like a Hash Map but no order, permits the null element
*Objects are inserted based on their hash code.
* the values are stored with respect to the generated hash
*
* */
    public static void main(String[] args) {
        /*
        * The set interface allows the users to perform the basic mathematical operation on the set.
        * Let’s take two arrays to understand these basic operations. Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5]. Then the possible operations on the sets are:
        Example : set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5]
        Intersection
        Union
        Difference*/

        //Create the first Set:
        Set<Integer> set1 =  new HashSet<Integer>();
        //Adding All elements:
        set1.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        System.out.println(set1);

        //Create the second Set:
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));
        System.out.println(set2);

        //Union
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("the union for the two Set " + union);

        //Intersection:
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("the intersection for the two Set " + intersection);

        //the symmetric difference:
        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("Difference between the two set " + difference);

        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //Adding elements
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);

        set.add(list1);
        set.add(list2);

        System.out.println(set.size());
        /*
        * Befor storing an object ==> HashSet checks wether here is an existing entry using hashCode()
        *two lists are considered equals if they have the same elements in the same order
        * hashCode() ==> will gives us the same hash because they are equals
        *   Constructors of HashSet:
        *       HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);
        *       HashSet<E> hs = new HashSet<E>(int initialCapacity);
        *       HashSet<E> hs = new HashSet<E>();
        *       HashSet<E> hs = new HashSet<E>(Collection C);
         * */
        HashSet<String> h = new HashSet<String>();

        //Adding elements to the set:
        h.add("oussama");
        h.add("bougattaoui");
        h.add("ensa khouribga");
        System.out.println(h);

        //Accessing an element:
        //chack if the list contain a specific string:
        System.out.println("contain oussama or not " + h.contains("oussama"));
        //Remove an element:
        h.remove("bougattaoui");

        //Iterating over a list:
        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}

