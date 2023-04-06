package practices;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int price,number,monthly;
        System.out.print("Enter the price of the phone : " );
        price = input.nextInt();
        System.out.println("The price of the phone is : "+price );
        System.out.print("Enter Number of Installment : " );
        number = input.nextInt();
        input.close();
        System.out.println("The Number of Installment is : "+number );
           
        monthly= price/number;
        System.out.println("Total Installment per month is : "+monthly+ " Taka" );

	}

}
