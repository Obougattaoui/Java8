package StreamsDemo.StreamAPI.Sort;

import StreamsDemo.StreamAPI.Sort.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(176, "Roshan", "IT", 600000.0));
        list.add(new Employee(388, "Bikash", "A", 900000.0));
        list.add(new Employee(470, "Bimal", "DEFENCE", 500000.0));
        list.add(new Employee(624, "Sourav", "A", 400000.0));
        list.add(new Employee(176, "Prakash", "SOCIAL", 1200000.0));
        return list;
    }
}
