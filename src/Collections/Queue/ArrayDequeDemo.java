package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
    /*
    * Deque interface is a subtype of the queue interface
    * it can be used as queue(FIFO = first in first out), or as stack(LIFO)
    * ArrayDeque ===>
    *        as ana Array Double Ended Queue
    *        they are not thread-safe
    *        to be faster than stack
    *        to be faster than linkedList (when used as a queue)
    *
    * */

    public static void main(String[] args) {

        //Creating a deque :
        Deque<Integer> d = new ArrayDeque<Integer>();

        //Adding elements:
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);

        //Iterating:
        for (Integer element: d)
            System.out.println(element);

        d.clear();

        //Inserting at the start:
        d.addFirst(200);
        d.addFirst(300);

        //Inserting at the end :
        d.addLast(400);
        d.addLast(500);

        System.out.println(d);

        System.out.println("using Iterator");
        Iterator it = d.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("using a reverse Iterator");
        Iterator it2 = d.descendingIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }

        //Get the Head element
        System.out.println("/********************");
        System.out.println("The head element is " + d.element());
        System.out.println("The last element" + d.getLast());

        //Removin elements
        System.out.println("remove element as stack from the top: " + d.pop());
        System.out.println("remove element as a queue from the top: " + d.pop());
        // remove element from front
        System.out.println(d.pollFirst());

        // remove element from back
        System.out.println(d.pollLast());
    }
}
