package practices;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapnHashSet {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.get("England"));
    capitalCities.remove("England");
    System.out.println(capitalCities);
    capitalCities.clear();
    System.out.println(capitalCities);
    
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.contains("Mazda"));
    cars.remove("Volvo");
    System.out.println(cars.size());
    for (String i : cars) {
       System.out.println(i);
   }
  }
}
