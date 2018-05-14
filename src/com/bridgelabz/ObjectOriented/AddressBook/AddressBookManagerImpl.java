package com.bridgelabz.ObjectOriented.AddressBook;

import java.io.File;
import java.io.IOException;
import com.bridgelabz.utility.Utility;

public class AddressBookManagerImpl implements AddressBookManager {

	/* 
	 * Purpose : Creates new file 
	 */
	public void create() throws IOException {
		System.out.println("\n\t\t\tEnter the name of address book");
		String NewAddressBookName = Utility.inputString();
		File file = new File("AddressBook//"+ NewAddressBookName + ".json");
		if (file.createNewFile()) {
			System.out.println("\n\t\t\tFile is created!");
		} else {
			System.out.println("\n\t\t\tFile already exists.");
		}
	}

	
	/**
	 * Purpose : read function is to read data in file
	 * 
	 * @param inputAddressBook is the name of the file through which file is being read
	 * @throws Exception
	 */
	public void read(String inputAddressBook) throws Exception {
		AddressBookImpl addressbook = new AddressBookImpl();
		addressbook.read(inputAddressBook);
	}

	/**
	 * Purpose : readnDisplayFiles is a function is to read and display files.
	 */
	public void readnDisplayFiles() {
		File f = new File("AddressBook//");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				System.out.println("\n\t\t\t"+file.getName());
				count++;
			}
		}
		System.out.println("\n\t\t\tNumber of files: " + count);
	}

	/**
	 * Purpose : Checks whether the file is present or not
	 * 
	 * @param inputAddressBook is the name of file to be checked 
	 * @return returns true if file is present otherwise false.
	 */
	public boolean searchingAddress(String inputAddressBook) {
		File f = new File("AddressBook//");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(inputAddressBook + ".json")) {
					
					count++;
					break;
				}
			}
		}
		if (count == 0)
			return false;
		else
			return true;
	}

	

	/* 
	 * Purpose : save as function is to save another file with alternate name.
	 */
	public void saveAs() {
		AddressBookImpl addressbook = new AddressBookImpl();
		addressbook.saveAs();
		
	}
	
	/* 
	 * Purpose : Save function is to save a data in file.
	 */
	public void save(String file) {
		AddressBookImpl addressbook = new AddressBookImpl();
		addressbook.save(file);
	}
	
	/*
	 * Purpose : close function is to clear data in list.
	 */
	public void close(String inputAddressBook) {
		AddressBookImpl addressbook = new AddressBookImpl();
		addressbook.close(inputAddressBook);
	}



	/**operation is a function to do several operations in existing address book.
	 * @param addressBookManagerImpl	
	 * @param inputAddressBook
	 * @return String which is name of address book.
	 * @throws Exception
	 */
	public String operation(AddressBookManagerImpl addressBookManagerImpl,String inputAddressBook) throws Exception {
		AddressBookImpl addressbook = new AddressBookImpl();
		 return addressbook.operation(addressBookManagerImpl,inputAddressBook);
		
	}
	
	

}

