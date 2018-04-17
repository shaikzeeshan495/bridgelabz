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

		/**
	    * Static function to calculate Harmonic value. 
	    *
	    * @param number the number is to give N value.
	    */
	
	static void sum(int number)
	{
		float harmonic_value=0;
		if(number!=0)
		{
		for(int i=1;i<=number;i++)
			harmonic_value=((float)1/i)+harmonic_value;
		System.out.println("the harmonic value is: "+harmonic_value);
		}
		else
			System.out.println("please check the entered number");

	}
	
		/*
	    * The main function is to take input number as N.
	    */
	public static void main(String[] args) {
		System.out.println("Please enter the power value");
		int number=Utility.inputInteger();
		sum(number);	
	}

}
