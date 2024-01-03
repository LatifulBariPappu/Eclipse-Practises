package practices;
import java.util.Scanner;
public class StarPattern3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of rows : ");
    int rows = scanner.nextInt();
    System.out.println("\nThe Final pattern is : ");
    for (int m = 1; m <= rows; m++){
      for (int n = 1; n < m; n++){
        System.out.print(" ");
      }
      for (int p=rows; p>=m; p--){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
