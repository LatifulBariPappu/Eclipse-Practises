package practices;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int number = scanner.nextInt();
		scanner.close();
		int reversed_number = 0;
	    System.out.println("The number you entered: " + number);
	    while(number != 0) {
	      int digit = number % 10;
	      reversed_number = reversed_number * 10 + digit;
	      number /= 10;
	    }
	    System.out.println("Reversed Number: " + reversed_number);
	 }
}