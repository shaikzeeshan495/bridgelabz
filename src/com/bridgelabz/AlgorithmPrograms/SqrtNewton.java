/******************************************************************************
 *  Purpose:	To find the square root of a number by using Newton
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class SqrtNewton {

	public static void main(String[] args) {
		 double inputValue;
		    System.out.println("Enter a non-negative number");
		    inputValue = Utility.inputInteger();
		    Utility.calculateSqrt(inputValue);
	}

}
