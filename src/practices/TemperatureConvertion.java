package practices;

import java.util.Scanner;

public class TemperatureConvertion {

	public static void main(String[] args) {
		Scanner inputScanner=new Scanner(System.in);
		double cels,farh;
		System.out.println("Celious : ");
		cels=inputScanner.nextDouble();
		inputScanner.close();
		farh=1.8*cels+32;
		System.out.println("Farenheit : "+farh);
	}

}
