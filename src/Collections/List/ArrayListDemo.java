package Collections.List;

import java.util.ArrayList;
/* List Interface:
    Characteristics :
 *                  Store the ordered collection of objects, Allows duplicate values
 * the implementation classes:
 *       ArrayList
 *       LinkedList
 *       Stack
 *       Vector
 * public interface List<E> extends Collection<E> ;
 * Operations:
 *       Adding: add() ==> add(Object)/ add(int index, Object)
 *       Updating: set(int index, Object)
 *       removing: remove()==> remove(Object)==> remove the first occurence /remove(index)
 *      Size: size()
 * Iterating Over a list:==> for each loop
 * */
public class ArrayListDemo {
    /*
       ArrayList : dynamic arrays in java
     * ArrayList inherits AbstractList, is not synchronized.
     * AbstractList ==> is used to implement an unmodifiable list
     *
     * CopyOnWriteArrayList ==> it is an enhanced(amelior) version fo ArrayList ,
     *   All modifications are implemented by making a fresh copy of the list.
     *
     *
     * AbstractSequentialList ==> implements the Collection INTERFACE
     * and AbstractCollection class ==> to implement unmodifiable list.
     *
     * */

    /*
     * ArrayList Constructors:
     *   ArrayList() ==> an empty arraylist
     *   ArrayList(Collection c) ==> initialized
     *   ArrayList(int capacity) ==> initial size
     *
     * */
    public static void main(String[] args) {
        int n =5;
        ArrayList<Integer> arr = new ArrayList<>(n);//initial size is n = 5

        //Adding elements
        for (int i =1; i <= n; i++){
            arr.add(i);
        }
        //Add azn element in a specific index:
        arr.add(2, 100);

        //Printing elements:
        System.out.println(arr);

        //Removing element
        arr.remove(3);//by index

        //Printing elements:
        System.out.println(arr);

        //printing elements one by one:
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        //Changing elements:
        arr.set(1, 3000);

        //Iterating
        for (Integer x: arr)
            System.out.println(x);
    }
}
