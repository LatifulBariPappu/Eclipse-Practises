package polymorphism;

public class Caller {
	public static void main(String[] args) {
		A a=new B();//UpCasting
		a.m1();
		a.m2();
	}
}
