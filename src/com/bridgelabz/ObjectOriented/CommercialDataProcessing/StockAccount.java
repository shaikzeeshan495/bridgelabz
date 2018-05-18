package com.bridgelabz.ObjectOriented.CommercialDataProcessing;
/******************************************************************************
 *  Purpose:	StockAccount interface for implementing stock account
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
import java.util.List;

public interface StockAccount {
	public List<Customer> addCustomer();
	public void buyShares() throws Exception;
	public void sellShares() throws Exception;
	public void saveTransaction();
	public void displayTransaction();

}
