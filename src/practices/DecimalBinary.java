package practices;

import java.util.Scanner;

public class DecimalBinary 

{

    public static void main(String[] args) 

    {

        int n;
        String x = "";

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Decimal Number:");

        n = s.nextInt();
        s.close();

        while(n>0)

        {

            int a = n%2;
            x = a+x;
            n = n/2;

        }

        System.out.println(x);

    }

}