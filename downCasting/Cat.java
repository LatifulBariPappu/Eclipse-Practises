package downCasting;

public class Cat extends Animal{
	@Override
	void eat() {
		System.out.println("Cat is eating");
	}
	void meow() {
		System.out.println("Cat is Meowing");
	}

}
