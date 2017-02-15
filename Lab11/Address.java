/**
 * Author: Craig Lawlor 
 * C00184465
 */
package Lab11;

public class Address {
	public String street;
	public String city;
	public String county;
	
	
	//default constructor
	public Address(){
	}
	
	//constructor
	public Address(String street, String city, String county){
		setStreet(street);
		setCity(city);
		setCounty(county);
	}
	
	public void setStreet(String strE){
		street = strE;
	}
	
	public void setCity(String strC){
		city = strC;
	}
	
	public void setCounty(String strCo){
		county = strCo;
	}
	
	public String getStreet(){
		return street;
	}
	
	public String getCity(){
		return city;
	}

	public String getCounty(){
		return county;
	}
	
	// toString method
	public String toString(){
		return "Street: " + getStreet() + "\n" + "City: " + getCity() + "\n"
				+ "County: " + getCounty();
	}
}
