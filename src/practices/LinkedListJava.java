package practices;
import java.util.LinkedList;
public class LinkedListJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    LinkedList<String> cars = new LinkedList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    cars.addFirst("Toyota");
		    cars.addLast("Benz");
		    System.out.println(cars);
		    cars.removeLast();
		    System.out.println(cars);
		    System.out.println(cars.getLast());
		    
		  }
	}
