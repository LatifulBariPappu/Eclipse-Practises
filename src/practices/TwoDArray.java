package practices;

import java.util.Scanner;

public class TwoDArray {
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		int[][] twoDarray=new int[2][4];
		for (int raw=0;raw<2;raw++) {
			for (int column=0;column<4;column++) 
			{
				
				twoDarray[raw][column]=myScanner.nextInt();			}
		}
	for (int raw=0;raw<2;raw++) {
		for (int column=0;column<4;column++){
			
			System.out.print(twoDarray[raw][column]+"\t");			
		}
		System.out.println("\n");
		}
	}
}