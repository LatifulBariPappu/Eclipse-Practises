package practices;
import java.util.ArrayList;

public class Lamda {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } ); //ArrayList's for each method
    Consumer<Integer> method = (n) -> { System.out.println(n);}; //Consumer interface
    numbers.forEach( method );
  }
}