package upCasting;

public class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
	void bark() {
		System.out.println("Dog is barking");
	}

}
