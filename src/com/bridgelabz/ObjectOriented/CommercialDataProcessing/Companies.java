package com.bridgelabz.ObjectOriented.CommercialDataProcessing;
/******************************************************************************
 *  Purpose:	Company pojo for Stock account report
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   12-05-2018
 *
 ******************************************************************************/
public class Companies {
	String companyName;
	String companySymbol;
	int sharePrice;
	int totalShares;
	String time;
	
	public String getCompanyName() {
		return companyName;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public String getCompanySymbol() {
		return companySymbol;
	}
	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Companies [companyName=" + companyName + ", companySymbol=" + companySymbol + ", sharePrice="
				+ sharePrice + ", totalShares=" + totalShares + ", time=" + time + "]";
	}
	

}
