package StreamsDemo.StreamAPI.ForEachAndFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachAndFilterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("oussama");
        list.add("oumnia");
        list.add("bougattaoui");
        list.add("kahlaoui");

        //iterating using for loop:
        /*for (String s : list){
            System.out.println(s);
        }*/
        System.out.println("*******************************************");
        list.stream().forEach(e -> System.out.println(e));
        System.out.println("*******************************************");
        list.stream().filter(s -> s.startsWith("o")).forEach(e -> System.out.println(e));
        System.out.println("*******************************************");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "oussama");
        map.put(2, "oumnia");
        map.put(3, "bougattaoui");
        map.put(4, "kahlaoui");
        //but we can't use the pipeline methods
        map.forEach((key, value) -> System.out.println(key + " : "+ value));
        System.out.println("*******************************************");
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
        list.forEach(e -> System.out.println(e));
        System.out.println("*******************************************");
        map.entrySet().stream().filter(t -> t.getKey()%2==0).forEach(obj -> System.out.println(obj));
        /*
        * <===> for (T t : this) {action.accept}
        * */
    }
}
