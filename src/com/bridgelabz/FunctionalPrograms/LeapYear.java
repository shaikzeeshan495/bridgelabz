/******************************************************************************
 *  Purpose:	To check weather leap year or not.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class LeapYear {
		/*
	    * The main function is to take input number as a year from user.
	    */
		public static void main(String[] args) {
	    	System.out.println("Enter a Year:");
	    	int year = Utility.inputInteger();
			boolean isLeapYear=Utility.isLeap(year);
			if(isLeapYear==true)
	            System.out.println(year + " is a Leap Year.");
	        else
	            System.out.println(year + " is not a Leap Year.");
		}
}