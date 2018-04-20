/******************************************************************************
 *  Purpose:	To find the roots of the equation.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class Quadratic {

		/*
	    * The main function is to take input numbers to calculate equation.
	    */
	public static void main(String[] args) {	
		System.out.println("Enter the input a");
		int a=Utility.inputInteger();
		System.out.println("Enter the input b");
		int b=Utility.inputInteger();
		System.out.println("Enter the input c");
		int c=Utility.inputInteger();
		Utility.findRoots(a,b,c);		
	}

}
