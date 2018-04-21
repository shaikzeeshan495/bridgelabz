/******************************************************************************
 *  Purpose:	To Convert decimal to binary
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class toBinary {

	public static void main(String[] args) {
		System.out.println("enter a decimal number");
		int decimal=Utility.inputInteger();
		String result=Utility.toBinary(decimal);
		System.out.println(result);

	}

}
