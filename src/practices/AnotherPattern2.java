package practices;
import java.util.Scanner;
public class AnotherPattern2{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide number of rows to print : ");
    int rows = scanner.nextInt();
    System.out.println("\nThe pattern is : ");
    for (int m=rows; m>=1; m--){
      for (int n=1; n <=(m * 2) -1; n++){
        if( n == 1 || n == (m * 2) -1 || m == rows)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
      for (int p = rows; p >= m; p--){
        System.out.print(" ");
      }
    }
  }
}
