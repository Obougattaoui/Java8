package StreamsDemo.StreamAPI.Sort;

import java.util.*;

public class SortMapList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("bougattaoui", 2);
        map.put("oussama", 3);
        map.put("bouga", 4);
        map.put("amani", 1);

        Map<Employee, Integer> employeeIntegerMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        employeeIntegerMap.put(new Employee(176, "Roshan", "IT", 600000.0), 60);
        employeeIntegerMap.put(new Employee(388, "Bikash", "CIVIL", 900000.0), 90);
        employeeIntegerMap.put(new Employee(470, "Bimal", "DEFENCE", 500000.0), 50);
        employeeIntegerMap.put(new Employee(624, "Sourav", "CORE", 400000.0), 40);
        employeeIntegerMap.put(new Employee(176, "Prakash", "SOCIAL", 1200000.0), 120);
        System.out.println(employeeIntegerMap);
        System.out.println("***********************************************");
        employeeIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))).forEach(obj -> System.out.println(obj));


        //Traditional way :
        /*List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }*/
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(obj -> System.out.println(obj));
        System.out.println("***********************************************");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(obj -> System.out.println(obj));
    }
}
