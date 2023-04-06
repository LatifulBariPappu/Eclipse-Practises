package practices;

import java.util.Scanner;

public class Hello {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("May I Know your Name Please?");
		String name=sc.nextLine();
		System.out.println("Hello! "+name);
	}

}
