package Collections.List;

import java.util.Vector;

public class VectorDemo {
    /*
     * Vector is a growable(dynamic) array of objects.
     * implements the List interface
     * Vector is synchronized
     * Synchronization: Only One thread at a time can access.
     * the code ===> Thread safe
     * it gives a poor performance in adding,searching, deleting, updating
     * if the increment is specified ==> Vector will expand according to it in each allocation cycle,
     * if the increment is not specified then Vector's capacity gets doubled in each allocation cycle.
     * Three protected data members:
     *   int capacityIncreament: increment value
     *   int elementCount: number of elements currently in vector stored in it.
     *   Object elementData []: Array that holds the vector is stored in it.
     *
     * Constructors:
     *               Vector<E> v = new Vector<E>(); === > initial capacity = 10
     *               Vector<E> v = new Vector<E>(int size, int incr); ==> initial capacity(size)
     *               Vector<E> v = new Vector<E>(Collection c);
     * */
    public static void main(String[] args) {
        System.out.println("*************Vectors*************");
        //creating a default vector:
        Vector v1 = new Vector();

        //Adding elements:
        v1.add(1);
        v1.add(2);
        v1.add("oussama");

        //Printing
        System.out.println(v1);

        //Creating a generic vector:
        Vector<Integer> v2 = new Vector<Integer>();

        //Adding elements:
        v2.add(1);
        v2.add(2);
        v2.add(3);

        //printing
        System.out.println(v2);

        //Updating elements:
        v2.set(0, 100000);
        v2.set(1, 200000);

        //Printing:
        System.out.println(v2);

        //Removing element at a specific index
        v2.remove(0);

        //Printing:
        System.out.println(v2);

        //Iterating:
        for (Integer x: v2)
            System.out.println(x);
    }
}
