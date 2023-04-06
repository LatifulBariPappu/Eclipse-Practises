package practices;
import java.util.*;

public class StackExample {
 public static void main(String args[])
 {
     
     Stack<Integer> STACK = new Stack<Integer>();              // Creating an empty Stack
     Stack<Integer> stack2= new Stack<Integer>();

     STACK.push(10);
     STACK.push(15);
     STACK.push(30);
     STACK.push(20);
     STACK.push(5);
     
     stack2.push(4);

    
     System.out.println("Initial Stack: " + STACK);              // Displaying the Stack

     
     System.out.println("Popped element: " +STACK.pop());      // Removing elements using pop() method
     System.out.println("Popped element: " +STACK.pop());

     
     System.out.println("Stack after pop operation "+ STACK);   // Displaying the Stack after pop operation
     System.out.println("Stack after pop operation "+ stack2);
 }
 
}