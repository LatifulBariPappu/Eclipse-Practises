package runnableThread;

import java.util.Scanner;

public class MainCLass {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		CustomRunnableObject firstObject=new CustomRunnableObject("First", 0);
		CustomRunnableObject secondObject=new CustomRunnableObject("Second", 200);
		CustomRunnableObject thirdObject=new CustomRunnableObject("Thrid", 10000);
		//CustomRunnableObject fourthObject=new CustomRunnableObject("Fourth", 5000000);
		
		Thread firstThread=new Thread(firstObject);
		Thread secondThread=new Thread(secondObject);
		Thread thirdThread=new Thread(thirdObject);
		Thread fourthThread=new Thread(firstObject);
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();
		fourthThread.start();

		System.out.println("Please write a command : ");
		String commandString=scanner.nextLine();
		while(!commandString.toLowerCase().equals("exit")) {
			if(commandString.equals("1")) {
				System.out.println("Counter in Thread 1 : "+firstObject.getCounter());
			}
			else if(commandString.equals("2")) {
				System.out.println("Counter in Thread 2 : "+secondObject.getCounter());
			}
			else if(commandString.equals("3")) {
				System.out.println("Counter in Thread 3 : "+thirdObject.getCounter());
			}
			else if(commandString.equals("4")) {
				System.out.println("Counter in Thread 4 : "+firstObject.getCounter());
			}
			else if(commandString.toLowerCase().equals("stop1")) {
				firstThread.interrupt();
				System.out.println("First Thread Interrupted");
			}
			else if(commandString.toLowerCase().equals("stop2")) {
				secondThread.interrupt();
				System.out.println("Second Thread Interrupted");				
			}
			else if(commandString.toLowerCase().equals("stop3")) {
				thirdThread.interrupt();
				System.out.println("Third Thread Interrupted");				
			}
			else if(commandString.toLowerCase().equals("stop4")) {
				fourthThread.interrupt();
				System.out.println("Fourth Thread Interrupted");
			}
			else {
				System.out.println("Please GIve a Proper Command.");
			}

			System.out.println("Please write a command : ");
			commandString=scanner.nextLine();
		}
		scanner.close();

		System.out.println("\n\n---Exit from Thread---");
	}
		
}

