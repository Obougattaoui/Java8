package StreamsDemo.StreamAPI.FunctionalInterface;

/*
*
* */
@FunctionalInterface
public interface MyFunctionalInterface {
    void m1();
    default void m2(){
        System.out.println("hello");
    }
}
