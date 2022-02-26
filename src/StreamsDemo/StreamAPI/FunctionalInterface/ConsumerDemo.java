package StreamsDemo.StreamAPI.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    /*
    * functional interface === contain only one abstract method(Not implemented) but can have multiple default and static method.
    * Lambda expression Represent an anonymous(nameless/unkown => dont have any name or modifier) function, applicable only for functional interface.
    * Consumer functional interface: used when an object needs to be consumed taken as input, and some operation without returning any result.
    * */

    public static void main(String[] args) {
        /*Just implementation dont execute until we call it*/
        Consumer<Integer> c = (integer) ->{
            System.out.println("Printing  : " + integer);
        };
        c.accept(10);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        //list1.stream().forEach(c);
        list1.stream().forEach((integer) -> System.out.println("Printing  : " + integer));
    }
}
