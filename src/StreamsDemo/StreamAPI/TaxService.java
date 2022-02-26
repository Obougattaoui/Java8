package StreamsDemo.StreamAPI;

import StreamsDemo.StreamAPI.Sort.DataBase;
import StreamsDemo.StreamAPI.Sort.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String s){
        return (s.equalsIgnoreCase("tax")) ?
            DataBase.getEmployees().stream()
                .filter(emp -> emp.getSalary() > 500000)
                .collect(Collectors.toList())
                : DataBase.getEmployees().stream()
                    .filter(emp -> emp.getSalary() <= 500000)
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUsers("oussama"));
    }
}