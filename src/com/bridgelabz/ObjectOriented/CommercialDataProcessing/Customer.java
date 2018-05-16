package com.bridgelabz.ObjectOriented.CommercialDataProcessing;

public class Customer {
	
	String name;
	int amount;
	String symbol;
	int numberShares;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public String getSymbol() {
		return symbol;
	}
	public int getNumberShares() {
		return numberShares;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public void setNumberShares(int numberShares) {
		this.numberShares = numberShares;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", amount=" + amount + ", symbol=" + symbol + ", numberShares=" + numberShares
				+ "]";
	}
	

}
