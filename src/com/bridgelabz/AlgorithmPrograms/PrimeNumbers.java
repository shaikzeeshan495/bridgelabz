/******************************************************************************
 *  Purpose:	To generate prime numbers in given range.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;


import com.bridgelabz.utility.Utility;

public class PrimeNumbers {
	
	public static void main(String []args)
	{
		System.out.println("enter the Nth term");
		int nTerm=Utility.inputInteger();
		int res[]=Utility.primeNum(nTerm);
		System.out.println("Prime numbers are");
		for(int i=0;i<res.length;i++)
		{
			if(res[i]!=0)
		System.out.print(res[i]+" ");
		}
	}

}
