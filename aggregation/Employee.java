package aggregation;

public class Employee {
	int id;
	String name;
	Address address;   //Aggregation/Composition/HAS A Relationship
	

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.getCity()+" "+address.getDivision()+" "+address.getCountry());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("Naogaon","BD", "RAJ");
		Employee employee=new Employee(2025402004,"Latiful Bari", address1);
		employee.display();
	}
}
