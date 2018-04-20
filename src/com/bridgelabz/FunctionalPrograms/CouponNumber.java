/******************************************************************************
 *  Purpose:to generate random number and to process distinct coupons.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class CouponNumber {

		/*
	    * The main function is to take input numbers to generate the no of coupons.
	    */	
	public static void main(String[] args) {
		System.out.println("enter the number of coupon to generate");
		int number=Utility.inputInteger();
		Utility.randomnumber(number);
	}

}

