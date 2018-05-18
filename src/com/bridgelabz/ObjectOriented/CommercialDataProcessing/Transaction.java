package com.bridgelabz.ObjectOriented.CommercialDataProcessing;
/******************************************************************************
 *  Purpose:	Transaction pojo class for Stock account report
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
public class Transaction {
	String customerName;
	String companySymbol;
	String buySell;
	int totalShares;
	int totalPrice;
	String time;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCompanySymbol() {
		return companySymbol;
	}
	public String getBuySell() {
		return buySell;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}
	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Transaction [customerName=" + customerName + ", companySymbol=" + companySymbol + ", buySell=" + buySell
				+ ", totalShares=" + totalShares + ", totalPrice=" + totalPrice + ", time=" + time + "]";
	}
	

}
