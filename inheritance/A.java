package inheritance;

public class A {
	int a=20;
	A(){
		System.out.println("Class A Constuctor");
	}
	
	static {
		System.out.println("Class A Static Block");
	}
	
	{
		System.out.println("Class A Instance Block");
	}

}
