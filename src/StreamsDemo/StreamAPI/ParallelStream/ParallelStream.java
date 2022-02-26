package StreamsDemo.StreamAPI.ParallelStream;


import StreamsDemo.StreamAPI.Sort.Employee;

import java.util.List;
import java.util.stream.IntStream;

/*
* -Parallel Streams is using for multiple cores of the processor
* -With Parallel Streams we can divide the code into multiple streams that are executed in parallel on separate ,
* cores and the final result is the combination of the Individual outcomes.
* -order of execution in parallel stream is not sorted
* -divide the code into multiple streams that are executed in parallel on separate cores and the final result is the combination of the individual outcomes
* -every core has multiple Thread.
* -Parallel stream faster Response.
* */


public class ParallelStream {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream took time: " + (end - start));
        System.out.println("**********************************************");
        //using parallel stream:
        start = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took time: " + (end - start));
        System.out.println("********************************");

        IntStream.range(1, 10).forEach(value -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + value);
        });

        IntStream.range(1, 10).parallel().forEach(value -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + value);
        });




        List<Employee> employees = EmployeeDatabase.getEmployees();

        //normal :
        start = System.currentTimeMillis();
         double salaryWithStream = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal stream execution time: "+ (end -start));

        start = System.currentTimeMillis();

        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel stream execution time: "+ (end -start));
    }
}
