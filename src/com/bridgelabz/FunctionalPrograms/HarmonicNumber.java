/******************************************************************************
 *  Purpose:	Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	
		/*
	    * The main function is to take input number as N.
	    */
	public static void main(String[] args) {
		System.out.println("Please enter the value");
		int number=Utility.inputInteger();
		Utility.sum(number);	
	}

}
