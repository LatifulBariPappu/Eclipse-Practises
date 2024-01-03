package practices;
import java.util.Scanner;
public class StarPattern4{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please Enter the number of rows :\t");
    int rows = scanner.nextInt();
    System.out.println("\nThe star pattern is : ");
    for (int m = 1; m <= rows; m++){
      for (int n=rows; n>m; n--){
        System.out.print(" ");
      }

      for (int p=1; p<=(m * 2) -1; p++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
