package objectOrientedCars;

public class subCar extends CarClass implements carInterface{
	public String carColor;
	protected int manufacturingYear=2010;
	
	public subCar() {
		super()	;
	}
	
	public subCar(String manufacturingName,int engineCc,float carWeight,float fuelAmount,String carColor) {
		super(manufacturingName, engineCc, carWeight, fuelAmount);
		this.carColor=carColor;
	}
	@Override
	public void printAllInfo() {
		System.out.println("Manufacturer : "+manufacturingName);
		System.out.println("EngineCC : "+engineCc);
		System.out.println("Car Weight : "+carWeight);
		System.out.println("FuelAmount : "+fuelAmount);
		System.out.println("carColor : "+carColor);
		System.out.println("Manufacturing Year : "+getManufacturingYear(manufacturingYear));
		
		
	}

	@Override
	public int getManufacturingYear(int year) {
		return manufacturingYear;
	}
}
