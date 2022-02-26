package StreamsDemo.StreamAPI.Sort;

import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {

        List<Employee> employees = DataBase.getEmployees();
        //traditionnal way :
        //Collections.sort(employees, (o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        System.out.println(employees);
        //Using stream api :
        employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);
        //employees.stream().sorted(Comparator.comparing(Employee::getName))
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(18);
        list.add(30);
        //in traditional way:
        Collections.sort(list);//Ascending
        //Collections.reverse(list);//Descending
        System.out.println(list);

        //Using Streams:
        list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));*/
    }
}
