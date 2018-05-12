package com.bridgelabz.ObjectOriented.AddressBook;

import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.utility.Utility;

public class AddressBookImplementation implements AddressBook{
	
	public static List<Person> list=new ArrayList<>();
	@Override
	public void addPerson() {
		Person p=new Person();
		System.out.println("enter firstName");
		String firstName=Utility.inputString();
		p.setFirstName(firstName);
		System.out.println("enter LastName");
		String lastName=Utility.inputString();
		p.setLastName(lastName);
		System.out.println("enter city");
		String city=Utility.inputString();
		p.setCity(city);
		System.out.println("enter state");
		String state=Utility.inputString();
		p.setState(state);
		System.out.println("enter zip");
		int zip=Utility.inputInteger();
		p.setZip(zip);
		list.add(p);
		
	}

	@Override
	public void editPerson() {
		System.out.println("enter 1 to edit firstName");
		System.out.println("enter 2 to edit LastName");
		System.out.println("enter 3 to edit city");
		System.out.println("enter 4 to edit state");
		System.out.println("enter 5 to edit zip");
		int choice=Utility.inputInteger();
		switch(choice)
		{
			
		}
		
	}

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortLastName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zip() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void PhoneNumber() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
		
	}

	
	

}
