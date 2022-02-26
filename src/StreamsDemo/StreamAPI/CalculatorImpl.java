package StreamsDemo.StreamAPI;

interface Calculator{
    //void switchOn();
    //void sum(int input);
    int sum(int i1, int i2);
}

public class CalculatorImpl {


    public static void main(String[] args) {
        /*Calculator calculator = (input) -> {
            System.out.println("Lambda expression " + input);
        };
        //One statement ignore {} just -> ...............
        calculator.sum(10);*/
        Calculator calculator = (i, j) -> i + j;
        System.out.println(calculator.sum(10,20));
    }
}
