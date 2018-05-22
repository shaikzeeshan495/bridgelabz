
package com.bridgelabz.ObjectOriented.AddressBook;

/**Person class is a POJO class
 * @author zeeshan
 *
 */
public class Person {
	String firstName;
	String lastName;
	String phoneNumber;
	String city;
	String state;
	long zip;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "\n\t\t\t\t---Details of "+firstName+"--- \n\t\t\t\tFirst Name\t: " + firstName + "\n\t\t\t\tLast Name\t: " + lastName +  "\n\t\t\t\t   City\t\t: " + city + "\n\t\t\t\t   State\t: " + state + "\n\t\t\t\t   Zip\t\t: " + zip + "\n\t\t\t\tPhone Number\t: "
				+ phoneNumber + "\n\n";
	}

}
