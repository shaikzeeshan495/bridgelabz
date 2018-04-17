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

		/**
	    * Static function to computes the prime factorization of N. 
	    *
	    * @param number the number is to give N value.
	    */
	static void factorization(int number)
	{
		while(number%2==0)
		{
			System.out.print(2+" ");
			number/=2;
		}
		
		for(int i=3;i*i<=number;i++)
		{
			while(number%i==0)
			{
				System.out.print(i+" ");
				number/=i;
			}
		}
		
		if(number>2)
			System.out.print(number);
	}
	
		/*
	    * The main function is to take input number.
	    */
	public static void main(String[] args) {
		System.out.println("Please enter the input number");
		int number=Utility.inputInteger();
		factorization(number);
	}

}
