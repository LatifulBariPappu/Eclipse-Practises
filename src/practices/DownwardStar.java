package practices;
import java.util.Scanner;
public class DownwardStar{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of rows : ");
    int rows = scanner.nextInt();
    System.out.println("\nThe Downward Star Pattern is : ");
    for (int m=rows; m>=1; m--){
      for (int n=1; n<=(m * 2) -1; n++){
        System.out.print("*");
      }
      System.out.println();
      for (int p=rows; p>=m; p--){
        System.out.print(" ");
      }
    }
  }
}
