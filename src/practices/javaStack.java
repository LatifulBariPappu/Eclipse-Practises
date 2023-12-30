import java.io.*;
import java.util.*;

public class javaStack{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('}', '{');
        hashMap.put(']', '[');
        hashMap.put(')', '(');
        
        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> stack= new Stack<Character>();
            
           for (Character c : input.toCharArray()){
               
               if (hashMap.containsKey(c) &&
               stack.size() >0 &&
                stack.peek().equals(hashMap.get(c))){
                    stack.pop();  
               }
               else {
                   stack.add(c);
               }           
           }
             
            if(stack.size()==0){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            
        }
    }
}
