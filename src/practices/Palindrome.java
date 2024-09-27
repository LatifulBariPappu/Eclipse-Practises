package practices;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		int length=str.length();
		for(int i=0;i<=length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a string to check palindrome or not :");
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		scanner.close();
		System.out.println(string+" is palindrome : "+isPalindrome(string));
		
	}

}
