package com.bridgelabz.ObjectOriented.CommercialDataProcessing;
/******************************************************************************
 *  Purpose:	Customer pojo for Stock account report
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
public class Customer {
	
	private String name;
	private int amount;
	private int numberOfShares;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	
	public int getNumberShares() {
		return numberOfShares;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setNumberShares(int numberShares) {
		this.numberOfShares = numberShares;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + ", numberShares=" + numberOfShares
				+ "]";
	}
	

}
