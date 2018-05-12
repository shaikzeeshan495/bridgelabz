package com.bridgelabz.ObjectOriented.AddressBook;

import com.bridgelabz.utility.Utility;

public class AddressMain {

	public static void main(String[] args) {
		AddressBookImplementation addressbook = new AddressBookImplementation();
		System.out.println("1 to add person");
		System.out.println("2 to edit contact");
		System.out.println("3 to delete contact");
		System.out.println("4 to sortLastName contact");
		System.out.println("5 to sort by zip");
		int choice=Utility.inputInteger();
		switch(choice)
		{
		case 1:	addressbook.addPerson();
				addressbook.print();
				break;
		case 2: System.out.println("enter the first name to edit contact");
				addressbook.editPerson();		
				break;
		}
	/*	
			*/
	}

}
