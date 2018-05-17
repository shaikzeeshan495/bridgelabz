package com.bridgelabz.ObjectOriented.AddressBook;
/******************************************************************************
 *  Purpose:	AddressBook interface
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
import java.util.List;

public interface AddressBook {
	public List<Person> add();
	public void edit();
	public void remove() throws Exception;
	public void sortByName();
	public void sortByZip();
	public void printAll();

}
