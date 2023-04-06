package practices;

import java.util.Stack;


public class StackExample2 {

	public static void main(String[] args) {
		Stack<String> stackStrings=new Stack<String>();
		
		stackStrings.push("Mr A");
		stackStrings.push("Mr B");
		stackStrings.push("Mr C");
		stackStrings.push("Mr D");
		System.out.println("Elements in Stack : "+stackStrings);
		System.out.println("Poped element : "+stackStrings.pop());
		System.out.println("Poped element : "+stackStrings.pop());
		System.out.println("Peek in Stack : "+stackStrings.peek());
		System.out.println("Elements in Stack after Poped : "+stackStrings);

	}
}
