package com.bridgelabz.ObjectOriented.AddressBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.Utility;

public class AddressBookImpl implements AddressBook {
	static int COUNT = 0;
	public static List<Person> list = new ArrayList<Person>();
	ObjectMapper mapper = new ObjectMapper();

	/* 
	 * Purpose : add person in person list
	 */
	public List<Person> add() {
		list.add(addUser());
		for (Person P : list) {
			System.out.println(P.toString());
		}
		return list;
	}

	/**
	 * Purpose : Adding information of person and add it in an object
	 * 
	 * @return object of person with added information in it
	 */
	private Person addUser() {
		Person person = new Person();
		
		System.out.println("\n\t\t\tEnter First Name");
		person.setFirstName(Utility.inputString());
		System.out.println(person.getFirstName());
		System.out.println("\n\t\t\tEnter Last Name");
		person.setLastName(Utility.inputString());
		System.out.println("\n\t\t\tEnter city");
		person.setCity(Utility.inputString());
		System.out.println("\n\t\t\tEnter State");
		person.setState(Utility.inputString());
		System.out.println("\n\t\t\tEnter ZipCode");
		person.setZip(Utility.inputInteger());
		System.out.println("\n\t\t\tEnter Phone Number");
		person.setPhoneNumber(Utility.inputString());
		return person;
	}

	/**
	 * Purpose : Editing of Address and phone number
	 * 
	 * @param P is the person object
	 * @param i is the case for editing address or phone number
	 */
	private void editAddressInformation(Person P) {
		
			boolean status=true;
		while(status)
		{
			
			System.out.println("\n\t\t\t1. To edit the LastName");
			System.out.println("\n\t\t\t2. To edit the state");
			System.out.println("\n\t\t\t3. To edit the city");
			System.out.println("\n\t\t\t4. To edit the ZipCode");
			System.out.println("\n\t\t\t5. To edit the new Phone Number");
			System.out.println("\n\t\t\t6. Save and Exit");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:	System.out.println("Please Enter");
					P.setLastName(Utility.inputString());
			case 2:	System.out.println("Please Enter");
					P.setState(Utility.inputString());
					break;
			case 3:	System.out.println("Please Enter");
					P.setCity(Utility.inputString());
					break;
			case 4:	System.out.println("Please Enter");
					P.setZip(Utility.inputInteger());
					break;
			case 5:	System.out.println("Please Enter");
					P.setPhoneNumber(Utility.inputString());
					break;
			case 6:	System.out.println("\n\t\t\tInformation updated ");
					status=false;
					break;
			default:System.out.println("Invalid input");
					break;
			}
			
		}
			
	}
	
	/* 
	 * Purpose : Sorting of data with respect to name
	 */
	public void sortByName() {
		Collections.sort(list, new SortByName());
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	/*
	 * Purpose : Sorting of data with respect to zip
	 */
	public void sortByZip() {
		System.out.println("before");
		Collections.sort(list, new SortByZip());
		for (Person person : list) {
			System.out.println("after");
			System.out.println(person.toString());
		}
	}

	/**
	 * Purpose : Saving list data in file 
	 * 
	 * @param file is the name of file in which list is saved 
	 */
	public void save(String file) {
		try {
			mapper.writeValue(new File( "AddressBook//"+file + ".json"), list);
			System.out.println("\n\t\t\tSaved");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Purpose : Saves the person list with alternate name in other file
	 */
	public void saveAs() {
		System.out.println("\n\t\t\tEnter the name of the new file");
		String fileNameNew = Utility.inputString();
		save(fileNameNew);
		System.out.println("\n\t\t\tData saved in new file");
	}

	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void read(String existingAddressBook) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("AddressBook//"+existingAddressBook + ".json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				list = objectMapper.readValue(arrayToJson, type);
				System.out.println(list.toString());
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/* 
	 *Purpose : Edit information of existing Person from list 
	 */
	public void edit() {
		System.out.println("\n\t\t\tEnter first name of person to edit");
		String firstName = Utility.inputString();
		for (Person P : list) {
			if (firstName.equals(P.getFirstName())) {
				COUNT++;
				System.out.println("\n\t\t\tData found\n");
				editAddressInformation(P);
			} 
		}
		if(COUNT==0)
			System.out.println("\n\t\t\tData not found");
	}

	/* 
	 * Purpose : Removing data of a person from list
	 */
	public void remove() throws Exception {
		System.out.println("\n\t\t\tEnter first name to remove data");
		String firstName = Utility.inputString();
		int count = 0;
		List<Person> deleteInfo = new ArrayList<>();
		for (Person P : list) {
			if (firstName.equals(P.getFirstName())) {
				System.out.println("\n\t\t\tData found\n\n\t\t\tData Removed");
				deleteInfo.add(P);
				count++;
			}
		}
		list.removeAll(deleteInfo);
		if (count == 0)
			System.out.println("\n\t\t\tdata not found");
	}

	

	/* 
	 * Purpose : Displaying the list
	 */
	public void printAll() {
		for (Person P : list) {
			System.out.println(P.toString());
		}
	}

	/**
	 * Purpose : clears the list from previous address book if new address book is opened
	 * 
	 * @param existingAddressBook
	 */
	public void close(String existingAddressBook) {
		list.clear();
	}
	
	/**operation is a function to do several operations in existing address book.
	 * @param addressBookManagerImpl	
	 * @param inputAddressBook
	 * @return String which is name of address book.
	 * @throws Exception
	 */
	public String operation(AddressBookManagerImpl addressBookManagerImpl,String inputAddressBook) throws Exception
	{
		System.out.println("\n\t\t\tEnter the name of the address book\n");
		inputAddressBook = Utility.inputString();
		if (addressBookManagerImpl.searchingAddress(inputAddressBook)) {
			System.out.println("\t\t\tFile Exists\n");
			addressBookManagerImpl.read(inputAddressBook);
			boolean menu=true;
			while (menu) {
				System.out.println("\n\t*****Menu*****\n");
				System.out.println("\t1. Add  new Person information");
				System.out.println("\t2. Edit  information");
				System.out.println("\t3. Remove information");
				System.out.println("\t4. Sort By Name");
				System.out.println("\t5. Sort By Zip");
				System.out.println("\t6. Display   information");
				System.out.println("\t7. Go for Main Menu");
				int choose = Utility.inputInteger();
				switch (choose) {
				case 1:	add();
						addressBookManagerImpl.save(inputAddressBook);
						break;
				case 2:	edit();
						addressBookManagerImpl.save(inputAddressBook);
						break;
				case 3:	remove();
						break;
				case 4:	sortByName();
						break;
				case 5:	sortByZip();
						break;
				case 6:	printAll();
						break;
				case 7:
					menu=false;
					break;
				default:
					System.out.println("\t\t\tinvalid input......Please try again");
					break;

				}
			}
		} else {
			System.out.println("\t\t\tCheck the given filename, given filename doesn't exist");
		}
		return inputAddressBook;
	}

	

}
