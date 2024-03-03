package aggregation;

public class Address {
	String city,country,division;

	public Address(String city, String country, String division) {
		super();
		this.city = city;
		this.country = country;
		this.division = division;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	

}
