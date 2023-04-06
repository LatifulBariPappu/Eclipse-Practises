package practices;

import java.util.Scanner;

public class AreaofTriangleandCircle {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
	
	double base,height,area;
	
	System.out.println("Enter base : ");
	base=input.nextDouble();
	
	System.out.println("Enter height: ");
	height=input.nextDouble();
	
	area=0.5*base*height;
	System.out.println("Area of Triangle : "+area);
	

	System.out.println("Enter Radious : ");
	double r=input.nextFloat();
	double ans=method1(r);

	System.out.println(ans);
	
	}
	static public double method1(double radious) {
		final double  pi=3.1416;
		double answer = pi*(radious*radious);

		System.out.println("Area of Circle : ");
		return answer;
		
	}

}
