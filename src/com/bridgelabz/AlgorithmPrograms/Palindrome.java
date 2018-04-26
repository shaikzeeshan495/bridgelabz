/******************************************************************************
 *  Purpose:	To check a palindrome.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("enter a number");
		int number=Utility.inputInteger();
		Utility.palindrome(number);
	}

}
