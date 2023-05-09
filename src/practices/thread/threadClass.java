package thread;

import java.util.Scanner;

public class threadClass {
	
	static Scanner myScanner  = new Scanner(System.in);
	
	public static void main(String[] args) {
		ourThread thread1=new ourThread("Worker 1", 10, 5, 60,true,null);
		ourThread thread2=new ourThread("Worker 2", 20, 10, 70 ,true,thread1);
		thread1.start();thread2.start();
		System.out.println("Please write a command : ");
		String commandString=myScanner.nextLine();
		while(!commandString.toLowerCase().equals("exit")) {
			if(commandString.equals("1")) {
				System.out.println("Counter in Thread 1 : "+thread1.getCounter());
			}
			else if(commandString.equals("2")) {
				System.out.println("Counter in Thread 2 : "+thread2.getCounter());
			}
			else if (commandString.toLowerCase().equals("status")) {

				System.out.println("Status Thread 1: "+thread1.isAlive());
				System.out.println("Status Thread 2: "+thread2.isAlive());
			}
			else if(commandString.toLowerCase().equals("stop1")) {
				thread1.stopThread();
			}
			else if(commandString.toLowerCase().equals("stop2")) {
				thread2.stopThread();
			}
			else {
				System.out.println("Please GIve a Proper Command.");
			}
			commandString=myScanner.nextLine();
		}
		System.out.println("\n\n---Exit from Thread---");
	}
}