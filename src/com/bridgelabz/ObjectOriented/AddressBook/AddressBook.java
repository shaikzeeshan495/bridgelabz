package com.bridgelabz.ObjectOriented.AddressBook;

import java.util.List;

public interface AddressBook {
	public List<Person> add();
	public void edit();
	public void remove() throws Exception;
	public void sortByName();
	public void sortByZip();
	public void printAll();

}
