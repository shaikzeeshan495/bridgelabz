package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

import java.util.List;

public interface StockAccount {
	public List<Customer> addCustomer();
	public void buyShares() throws Exception;
	public void sellShares() throws Exception;
	public void saveTransaction();
	public void displayTransaction();

}
