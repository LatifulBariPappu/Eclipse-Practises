package practices;
import java.util.*;

public class DrawardShape {
	 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Type shape length : ");
        int rows=sc.nextInt();
        sc.close();
        System.out.print("\n\n");
        for (int a = rows - 1; a >= 0; a--) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}