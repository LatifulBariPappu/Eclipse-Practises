package upCasting;

public class TestUpCasting {
	public static void main(String[] args) {
		Animal a;
		a=new Cat();
		a.eat();
		a.sleep();
		a=new Cow();
		a.eat();
		a.sleep();
		a=new Dog();
		a.eat();
		a.sleep();
	}

}
