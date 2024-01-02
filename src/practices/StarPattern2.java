package practices;
import java.util.Scanner;
public class StarPattern2{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows : ");
    int rows = scanner.nextInt();
    System.out.println("\nThe star pattern is : ");
    for (int m = 1; m <= rows; m++){
      for (int n = rows; n > m; n--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
