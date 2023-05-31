package practices;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b = 0,n=0,sum=0;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int first=a+1*b;
            sum=first;
            System.out.print(first);
            int j=2;
         
            	for(int k=1;k<n;k++) {
      
                	int next=sum+j*b;
                    sum=next;
                    System.out.printf(" "+next);
                    j=j*2;
        		}
        }
        in.close();  
     }
}
