/******************************************************************************
 *  Purpose:	To generate prime numbers and find annagram in that numbers
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class ExtendAnnagram {
	
	public static void main(String []args)
	{
		System.out.println("enter the Nth term");
		int nTerm=Utility.inputInteger();
		int primeArray[]=Utility.primeNum(nTerm);
		int array[]=Utility.extendAnnagram(primeArray);
		Utility.AnnagramOperation(array);
	}

}
