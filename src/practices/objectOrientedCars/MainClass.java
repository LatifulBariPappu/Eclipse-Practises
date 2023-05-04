package objectOrientedCars;

public class MainClass {
	static private CarClass ourCar=new CarClass();
	static private subCar ourSubCar=new subCar();
	public static void main(String[] args) {
		ourCar=new CarClass("Toyota", 1000, 54, 45);
		System.out.println("\n\n");
		ourCar.printAllInfo();	

		ourCar =new CarClass("BMW", 3000, 400, 985);
		System.out.println("\n\n");
		ourCar.printAllInfo();

		ourCar=new CarClass("Tusiba", 5000,554, 405);
		System.out.println("\n\n");
		ourCar.printAllInfo();
		ourSubCar=new subCar("Porshey",3000, 4000,200,"Yellow");
		System.out.println("\n\n");
		System.out.println("----Printing SubCar----\n");
		ourSubCar.printAllInfo();
		}
}
