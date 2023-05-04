package objectOrientedCars;

public class CarClass {
	public String  manufacturingName;
	public int engineCc;
	public float carWeight;
	public float fuelAmount;
	
	public CarClass() {
		manufacturingName = new String();
		engineCc=0;
		carWeight=0;
		fuelAmount=0;
	}

	public CarClass(String manufacturingName, int engineCc, float carWeight, float fuelAmount) {
		super();
		this.manufacturingName = manufacturingName;
		this.engineCc = engineCc;
		this.carWeight = carWeight;
		this.fuelAmount = fuelAmount;
	}

	public void printAllInfo() {
		System.out.println("Manufacturer : "+manufacturingName);
		System.out.println("EngineCC : "+engineCc);
		System.out.println("Car Weight : "+carWeight);
		System.out.println("FuelAmount : "+fuelAmount);
	}



}
 