package practices;
class Parent{

    Parent(int a, int b){

        System.out.println(" the super class constructor");
        int z = a + b;
        System.out.println("the super class method ");
        System.out.println("the sum is "+z);
    }
}
public class Child extends Parent{
   Child(int x){
       super(12, 20);
       System.out.println("the sub class constructor ");
       System.out.println(x);
   }
   public static void main(String[] args){
       Child obj = new Child(10);
    }
}