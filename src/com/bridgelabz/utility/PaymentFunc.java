package com.bridgelabz.utility;

public class PaymentFunc {
	
		/**
	    * Static function to calculate interest compounded monthly.
	    */
	public static void calculation(double principal,double rateOfInterest,double year)
	{
		double n=12*year,r=rateOfInterest/(12*100);
		double payment=(principal*r)/1-Math.pow((1+r), (-n));
		System.out.println(payment);
	}
}
