package downCasting;

public class TestDownCasting {
	
	public static void main(String[] args) {
		//valid downCasting
		Animal a=new Dog();
		Dog dog=(Dog)a;
		
		//best practice for downCasting
		Animal a1=new Cat();
		if(a1 instanceof Cat) {
			Cat cat=(Cat) a1;
			
			cat.eat();
			cat.sleep();
			cat.meow();
		}
	}
}
