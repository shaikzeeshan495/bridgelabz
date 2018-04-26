/******************************************************************************
 *  Purpose:	To guess a number in range and finding that number
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;


import com.bridgelabz.utility.Utility;

public class GuessNum {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		int inputNumber=Utility.inputInteger();
		int range=(int)Math.pow(2, inputNumber);
		 System.out.println("Think of a number between 0 and "+range);    
		   int result=Utility.guessing(0,range);
		    System.out.println(result + " " + "is the number");

	}

}
