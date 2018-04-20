/******************************************************************************
 *  Purpose:	prints a table of the powers of 2
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class PowerTwo {
		
			/*
		    * The main function is to take input number as a power N.
		    */
		public static void main(String[] args) {
			System.out.println(" The Power Value N");
			
			int power=Utility.inputInteger();
			Utility.powerValue(power);
		}
}
		

