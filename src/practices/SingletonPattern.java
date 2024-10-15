package programs;

public class SingletonPattern {
	
	static SingletonPattern object;
	
	SingletonPattern(){
		//default constructor
	}
	public static synchronized SingletonPattern getInstance() {
		if(object==null) {
			object=new SingletonPattern();
		}
		return object;
	}
}