package practices;

import java.util.Scanner;


public class BookStore {
	
	static Scanner myScanner=new Scanner(System.in);
	static String[] books={"Java","C","Python","DJango"};
	static final double studentDiscount=0.4;
	static final double teacherDiscount=0.3;
	static final double goveEmployeeDiscount=0.2;
		
	
	public static void main(String[] args) {
		
		
		prln("-------Welcome to Our BookStore------\n\n");
		prln("Avalaible Books in Our Store");
		prln("1.Java\n2.C\n3.Python\n4.DJango\n");
		
		prln("\nWhich Book do You Want?\n");
		String searchString = myScanner.nextLine();
		
		if(books[0].toLowerCase().equals(searchString.toLowerCase())) {
			prln("You Opted for "+books[0]+"Book.");
			calculatePrice(searchString);
		}
		else if(books[1].toLowerCase().equals(searchString.toLowerCase())) {
			prln("You Opted for "+books[1]+"Book.");
			calculatePrice(searchString);
		}
		else if(books[2].toLowerCase().equals(searchString.toLowerCase())) {
			prln("You Opted for "+books[2]+"Book.");
			calculatePrice(searchString);
		}
		else if(books[3].toLowerCase().equals(searchString.toLowerCase())) {
			prln("You Opted for "+books[3]+"Book.");
			calculatePrice(searchString);
		}
		else {
			prln("Soory! We don't have that book.");
		}
		
	}
	static void calculatePrice(String bookName) {
		String[] personString= {"1","2","3","4"};
		prln("Choose an option\t(input example:1/2/3/4/5)\nARE YOU --\n"
				+"1.Student\n2.Teacher\n3.Government Employee or\n4.General People");
		String answer=myScanner.nextLine();
		double price=200;
		if(answer.equals(personString[0])) {
			price=price-(price*studentDiscount);
			prln("Hurrah!You got 0.4% Discount");
			showPrice(price);
		}
		else if(answer.equals(personString[1])) {
			price=price-(price*studentDiscount);
			prln("Hurrah!You got 0.3% Discount");
			showPrice(price);
		}
		else if(answer.equals(personString[2])) {
			
			price=price-(price*studentDiscount);
			prln("Hurrah!You got 0.2% Discount");
			showPrice(price);
		}
		else if(answer.equals(personString[3])) {
			prln("Sorry!You have no Discount\nYou Need to total amount.");
			showPrice(price);
		}
		else {
			prln("Invalid Input");
		}
		
	}
	static void showPrice(double price){
		prln("Your total payable amount : "+price);
		prln("\n----- Thanks for Shopping from our Book Store -----");
	}


	static public void pr(Object anObject){
	
		System.out.print(anObject);
    }
	static public void prln(Object anObject){
	
		System.out.println(anObject);
    }
}
