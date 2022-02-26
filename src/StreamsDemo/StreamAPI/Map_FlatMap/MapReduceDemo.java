package StreamsDemo.StreamAPI.Map_FlatMap;


import StreamsDemo.StreamAPI.Sort.DataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
*   Map-Reduce:
*       Map ==> Transforming data
*       Reduce ==> Aggregating data
*           combine elements of a stream and produces a single value
*           Example :sum of numbers present in stream
*
*       T reduce(T identity, BinaryOperator<T> accumulator)
*           identity : is initial value of type T
*           accumulator is a function for combining two values
* */
public class MapReduceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);
        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        int sum = numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum);

        int sum2 = numbers.stream().reduce(0, (a, b) -> a+ b);
        System.out.println(sum2);

        // .reduce(BinaryOperator accumulaor) ==> predefined accumulatoe , Example:
        Optional<Integer> sum3 = numbers.stream().reduce(Integer::sum);
        System.out.println("sum3 : " + sum3.orElse(0));

        int mulResult =numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("**** : " + mulResult);

        //the max value :
        Integer maxValue = numbers.stream().reduce(0, (a, b) -> a>b?a:b);
        System.out.println("Max value is : " + maxValue);

        Integer maxValue2 = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max value is : " + maxValue2);

        String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1:word2).get();
        System.out.println("Longest String is : " + longestString);


        //Exemple Employee :
        //ge Employee whose grade is A:
        //get salary ==> Data transformation
        double avgSalary =  DataBase.getEmployees().stream()
                .filter(employee -> employee.getDept().equals("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println(avgSalary);

        double sumSalary =  DataBase.getEmployees().stream()
                .filter(employee -> employee.getDept().equals("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println(sumSalary);
    }
}
