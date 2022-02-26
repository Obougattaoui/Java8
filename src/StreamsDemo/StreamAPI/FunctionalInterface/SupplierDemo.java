package StreamsDemo.StreamAPI.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    /*
    * Supplier functional interface: used in all context where there is no input ut an output is excepted, method name: T get();
    * */
    public static void main(String[] args) {
        Supplier<String> s = () -> "HelLo Streams";
        System.out.println(s.get());
        List<String> list1 = Arrays.asList();
        //list1.stream().forEach((integer) -> System.out.println("Printing  : " + integer));
        //findAny(): find any element in the list.
        System.out.println(list1.stream().findAny().orElseGet(() -> "Nothing in the list"));
    }
}
