package com.bridgelabz.ObjectOriented.AddressBook;
/******************************************************************************
 *  Purpose:	AddressBookManager interface
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
import java.io.IOException;

public interface AddressBookManager {
	public void create()throws IOException;
	public void save(String file);
	public void saveAs();
	public void close(String file);


}
