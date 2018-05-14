package com.bridgelabz.ObjectOriented.AddressBook;

import java.util.Comparator;

public class SortByZip implements Comparator<Person>{
	
	/* compare is a function to compare data
	 * @returns integer data if equal 0,if firstperson greater than secondperson then -1
	 */
	public int compare(Person firstperson, Person nextperson) {
		if(firstperson.getZip()==nextperson.getZip())
			return 0;
		else {
			if(firstperson.getZip()>nextperson.getZip()) {
				return 1;
			}else {
				return -1;
			}
		}
	}

}
