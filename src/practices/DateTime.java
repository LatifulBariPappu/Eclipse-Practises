package practices;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTime {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now();
    System.out.println("the current date : "+myObj);
    LocalTime myObj1 = LocalTime.now();
    System.out.println("the current time : "+myObj1);
    LocalDateTime myDateTimeObj = LocalDateTime.now();
    System.out.println("Before formatting date and time: " + myDateTimeObj);
  }
}
