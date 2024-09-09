package practices;

public class Swapping {
	
	public static void main(String[] args) {
		int a=458,b=74,c=70,d=560,e=45,f=76;
		System.out.println("before swapping a = "+a+" ,b= "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping using third variable a = "+a+" ,b= "+b);
		
		System.out.println("before swapping c = "+c+" ,d= "+d);
		
		c=c^d;
		d=c^d;
		c=c^d;
		
		System.out.println("after swapping using XOR operation c  = "+c+" ,d= "+d);
        System.out.println("before swapping e = "+e+" ,f= "+f);
		
		e=e+f;
		f=e-f;
		e=e-f;
		
		System.out.println("after swapping using + - operation e  = "+e+" ,f= "+f);
	}

}
