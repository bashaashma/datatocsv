

import java.io.Serializable;

public class Member implements Serializable{

	private String address;
	private String city;
	private String firstName;
	private String idNumber;
	private String lastName;
	private String middleName;
	private String state;
	private String zip;
	


	

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Member [address=" + address + ", city=" + city + ", firstName=" + firstName + ", idNumber=" + idNumber
				+ ", lastName=" + lastName + ", middleName=" + middleName + ", state=" + state + ", zip=" + zip + "]";
	}
	
	
	
	
}
