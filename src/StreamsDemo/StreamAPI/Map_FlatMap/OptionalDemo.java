package StreamsDemo.StreamAPI.Map_FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmail(String email) {
        List<Customer> customers = DataBaseCustomers.getAll();
        Customer customer = customers.stream()
                .filter(c -> c.getEmail().equals(email))
                .findAny().orElse(new Customer());
        return customer;
    }



    public static void main(String[] args) {
        Customer customer = new Customer(101, "oussama","null", Arrays.asList("397937955", "21654725"));
        /*
        * Create Optional method:
        *   empty
        *   of
        *   ofNullable
        * */
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        //Optional<String> emaOptional =  Optional.of(customer.getEmail());//check if customer.getEmail() is null ==> throw NullPointerException
        //System.out.println(emaOptional);

        Optional<String> emaOptional2 =  Optional.ofNullable(customer.getEmail());
        System.out.println(emaOptional2);
        if(emaOptional2.isPresent())
            System.out.println(emaOptional2.get());
        System.out.println(emaOptional2.orElse("default@gmail.com"));

        System.out.println(emaOptional2.map(String::toUpperCase).orElseGet(()-> "default em ils ..."));

        getCustomerByEmail("ous");

    }
}
