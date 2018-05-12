package com.bridgelabz.ObjectOriented.AddressBook;

public class Person {
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
	}

	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int zip;
	private int phoneNumber;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
