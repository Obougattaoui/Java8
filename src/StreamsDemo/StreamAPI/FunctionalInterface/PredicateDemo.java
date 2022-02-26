package StreamsDemo.StreamAPI.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    /*
    * Predicate functional interface used for conditional check(true/false), method name: boolean test(T t)
    * */
    /*@Override
    public boolean test(Integer integer) {
        if (integer >= 0)
            return true;
        return false;
    }*/

    public static void main(String[] args) {
       //Predicate<Integer> pp = new PredicateDemo();
       //pp.test(3);
        /*Predicate<Integer> p = (integer) -> {
            if (integer >= 0)
                return true;
            return false;
        };*/
        Predicate<Integer> p = integer -> integer >= 0;
        System.out.println(p.test(0));

        /*Using Streams :*/
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        //list1.stream().forEach((integer) -> System.out.println("Printing  : " + integer));
        list1.stream().filter(integer -> integer%2 == 0).forEach((integer) -> System.out.println("Printing  : " + integer));
    }
}
