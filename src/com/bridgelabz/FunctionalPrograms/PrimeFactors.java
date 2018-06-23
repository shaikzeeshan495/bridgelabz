/******************************************************************************
 *  Purpose:	Computes the prime factorization of N.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class PrimeFactors {
	
		/*
	    * The main function is to take input number.
	    */
	public static void main(String[] args) {
		System.out.println("Please enter the input number");
		int number=Utility.inputInteger();
	//	Utility.factorization(number);
		int result=Utility.factorization2(number);
		if(result==-1)
		System.out.println("not a perfect square");
		else
			System.out.println("square root: "+result);
	}

}
