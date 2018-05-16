/******************************************************************************
 *  Purpose:	AddressBook
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented.AddressBook;

import com.bridgelabz.utility.Utility;

public class AddressBookMain {
	public static void main(String[] args) throws Exception {
		AddressBookManagerImpl addressBookManagerImpl = new AddressBookManagerImpl();
		String inputAddressBook = "";
		boolean mainMenu=true;
		while (mainMenu) {
		
			System.out.println("\t_____________________________________________\n");
			System.out.println("\t\t\tADDRESS BOOK");
			System.out.println("\t_____________________________________________\n");
			System.out.println("\t1. Create new Address Book");
			System.out.println("\t2. Open existing Address Book");
			System.out.println("\t3. Save As Address Book");
			System.out.println("\t4. Close Address Book");
			int choice = Utility.inputInteger();
			switch (choice) {
			
			case 1:
				addressBookManagerImpl.create();
				break;
		
			case 2:
				addressBookManagerImpl.close(inputAddressBook);
				addressBookManagerImpl.readnDisplayFiles();
				String inputAddressBook1=addressBookManagerImpl.operation(addressBookManagerImpl,inputAddressBook);
				System.out.println(inputAddressBook1+" address book was closed\n");
				break;
				
			case 3:
				addressBookManagerImpl.saveAs();
				break;
			
			case 4:
				System.out.println("Address book is closed");
				mainMenu = false;
				break;
			
			default:
				System.out.println("\t\t\tinvalid input........Please try again");
				break;
			}
		}
	}

}
