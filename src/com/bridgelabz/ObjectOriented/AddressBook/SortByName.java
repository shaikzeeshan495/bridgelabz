package com.bridgelabz.ObjectOriented.AddressBook;

import java.util.Comparator;

public class SortByName implements Comparator<Person>{
	/* 
	 * Compares data and returns 0 is data are same, 1 if first data is greater
	 * and -1 if second data is greater
	 */
	public int compare(Person firstperson, Person nextperson) {
		if(firstperson.getFirstName().equals(nextperson.getFirstName()))
			return 0;
		else {
			if(firstperson.getFirstName().compareTo(nextperson.getFirstName())>0) {
				return 1;
			}else {
				return -1;
			}
		}
	}

}