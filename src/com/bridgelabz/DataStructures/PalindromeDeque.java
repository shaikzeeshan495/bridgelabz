/******************************************************************************
 *  Purpose:	Palindrome checker
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   30-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class PalindromeDeque {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		String inputString=Utility.inputString();
		char []charArray=inputString.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			Dequeue.addRear(charArray[i]);
		}	
		Dequeue.operation();

	}

}
