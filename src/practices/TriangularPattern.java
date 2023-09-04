package practices;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class TriangularPattern {
	 

	    public static void main(String[] args) {

	        int i,j,k,n;

	        System.out.println("Enter the number of lines");
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try{
	            n = Integer.parseInt(br.readLine());
	        }catch (Exception e){
	            System.out.println("An error occurred");
	            return;
	        }
	        System.out.println("The triangular pattern is");
	        int blank = n-2;
	        for(i=1; i<=n; i++){
	            for(k=blank;k>=0;k--){
	                System.out.print(" ");
	            }
	            blank--;
	            for(j = 1; j<=i; j++){
	                System.out.print("* ");
	            }
	            System.out.println();

	        }

	    }

	}

