package Collections.List;

import java.util.Stack;

public class StackDemo {
    /*
     * Stack is a subclass of Vector
     * propertie: LIFO ==> Last In First Out
     * One default constructor ==> Stack()
     * */

    //Pushing elements on the top
    static void stack_push(Stack<Integer> stack){
        for (int i = 0; i < 5; i++){
            stack.push(i);
        }
    }

    public static void main(String[] args) {
        //Default initialization of stack:
        Stack stack1 = new Stack();

        //initialization of stack using generics
        Stack<String> stack2 = new Stack<String>();

        //pushing elements:
        stack1.push(1000);
        stack1.push("oussama");
        stack1.push("bougattaoui");

        stack2.push("Welcome");
        stack2.push("to");
        stack2.push("Ensa");
        stack2.push("khouribga");

        //Printing
        System.out.println(stack1);
        System.out.println(stack2);

        //Accessing elements:
        System.out.println("the element at the top is(the first element) " + stack2.peek());

        //Removing elements
        System.out.println("popped element: " + stack2.pop());
        System.out.println("popped element: " + stack2.pop());

        System.out.println("After pooping " + stack2);
        /*
        * e : Veuillez noter que la classe Stack en Java est une classe héritée et qu'elle hérite
        *  de Vector en Java. Il s'agit d'une classe thread-safe, ce qui implique des frais généraux lorsque n
        * ous n'en avons pas besoin. Il est recommandé d'utiliser ArrayDeque pour la mise en œuvre de la pile,
        *  car elle est plus efficace dans un environnement monofilaire.*/

    }
}
