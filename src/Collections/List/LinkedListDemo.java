package Collections.List;

import java.util.LinkedList;

public class LinkedListDemo {

    /*
    * LinkdeList is a linear data structure where the elements are not stored in contiguous locations and,
    * every element is a separate object with a data part and address part.
    * The elements are linked using pointers and addresses.
    * element == node
    * Constructors :
    *           LinkedList() : an empty linked list
    *           LinkedList(C) : C is a collection
     * */
    public static void main(String[] args) {

        //Create a linkedList:
        LinkedList<String> ll = new LinkedList<String>();

        //Adding elements:
        ll.add("oussama");
        ll.add("bougattaoui");
        ll.add("Ensa Khouribga");

        //Printing:
        System.out.println(ll);

        //Changing elements :
        ll.set(1, "oumnia");

        //Printing:
        System.out.println(ll);

        //Removing elements :
        ll.remove(0);
        ll.remove("Ensa Khouribga");

        //Printing after removing :
        System.out.println("After removing: " + ll);

        //Iterating a LinkedList:
        for (int i = 0; i < ll.size(); i++)
            System.out.println(ll.get(i));

        for (String s: ll)
            System.out.println(s);
    }
}
