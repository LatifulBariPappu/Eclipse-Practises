package practices;

public class Boolean {
	
	public static void main(String[] args) {
		int count = 2;
		System.out.println(!(count > 2));  
		System.out.println(!(count <= 2)); 
		
		boolean x = true;
		boolean y = false;
		System.out.println(!(x && y));  
		System.out.println(!(x || y));  
	}
}
