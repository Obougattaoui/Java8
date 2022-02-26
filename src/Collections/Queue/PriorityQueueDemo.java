package Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    /*Queue interface is used to hold : FIFO(first in First out)
    * A PriorityQueue is used when the objects are supposed to be processed based on the priority.
    * The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
    * doesn't permit null.
    * We can’t create PriorityQueue of Objects that are non-comparable
    * Constructors:
    *               PriorityQueue<E> pq = new PriorityQueue<E>();
    *               PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c);
    *               PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);
    *               PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator);
    *               PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c);
    *               PriorityQueue<E> pq = new PriorityQueue<E>(SortedSet<E> c);
    *  an element with maximum ASCII value will have the highest priority.
     * */
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        //Adding elements
        //The insertion order is not retained in the PriorityQueue.
        pq.add("oussama");
        pq.add("bougattaoui");
        pq.add("ensa");
        pq.add("khouribga");

        //printing:
        System.out.println(pq);

        //Removing elements: the first occurrence of the object is removed
        pq.remove("ensa");
        System.out.println("poll:(First Element) " + pq.poll());

        //printing:
        System.out.println(pq);

        //Accessing elements: we can access only the head of the queue
        String elem = pq.peek();
        System.out.println("the head element is: " + elem);

        //Iterating:
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
