package practices;

public class FourthLecture {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=30;
		b=calculateNumber(a, b);
		System.out.println(calculateNumber(a, b));
		System.out.println(b);
		
		System.out.println(a<b?"A is less than B":"B is less than A");
		System.out.println(a<b?a:b);
		
		int[] numberArray=new int[100];
		int i=100;
		while(i>0) {
			numberArray[i-1]=(i-1)*2;
			i--;
		}
		while(i<10) {
		System.out.println("Array["+i+"] : "+numberArray[i]);
		i++;
		}
		
		for(int k =0;k<=calculateNumber(a, b)/6;k++) {
			System.out.println(k);
		}
	}
	
	public static int calculateNumber(int number1,int number2) {
		number1+=number2;
		return number1;
    }
}