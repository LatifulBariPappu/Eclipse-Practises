package practices;
import java.util.Scanner;
public class AnotherPattern{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows to print : ");
    int rows = scanner.nextInt();
    System.out.println("\nThe pattern is : ");
    for (int m = 1; m <= rows; m++)
    {
      for (int n = 1; n < m; n++){
        System.out.print(" ");
      }
      for (int p = m; p <= rows; p++){
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int m = rows-1; m >= 1; m--){
      for (int n = 1; n < m; n++){
        System.out.print(" ");
      }
      for (int p = m; p <= rows; p++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
