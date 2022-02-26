package StreamsDemo.StreamAPI.Map_FlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap  {
    public static void main(String[] args) {
        List<Customer> customers = DataBaseCustomers.getAll();
        //List<Customer> convert List<String> : Data Transformation
        //we are mapping only emails from customers
        //One customer has only one email == one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);
        //phones ===> One to many mapping:
        List<List<String>> phones = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phones);
        //flatMap
        List<String> phones2 = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phones2);
    }
}
