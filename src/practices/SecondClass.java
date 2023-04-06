package practices;

public class SecondClass {

	public static void main(String[] args) {
		
//		int[] cards=new int[3];
		int[] cards= {1,6,8,900};
		//            0 1 2 3
		final short firstShortNumber;
		int secondIntNumber;
		firstShortNumber=11;
		secondIntNumber=2;
		float myFloatNumber=10;
		secondIntNumber/=2;
		secondIntNumber++;
		int result=firstShortNumber%secondIntNumber;
		
		char myCharacter='P';
		
		boolean statement=prokriya(firstShortNumber,secondIntNumber);
		
		System.out.println(firstShortNumber);
		System.out.println(secondIntNumber);
		System.out.println(result);
		System.out.println(statement);
		System.out.println(myCharacter);
	
		System.out.println(myFloatNumber);
		System.out.println(cards[3]);
		
		
	}

	static public boolean prokriya(int firstValue,int secondValue) {
		boolean answer=firstValue>secondValue;
		return answer;
	}
}
