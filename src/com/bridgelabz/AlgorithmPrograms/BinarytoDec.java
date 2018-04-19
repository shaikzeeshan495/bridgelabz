/******************************************************************************
 *  Purpose:	To convert binary and swap the nibbles and convert into decimal number
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class BinarytoDec {

	public static void main(String[] args) {
		System.out.println("Please enter a decimal  number");
		int dec=Utility.inputInteger();
		String binary=Utility.toBinary(dec);
		System.out.println("Binary is "+binary);
		String swapBinary=Utility.swapNibbles(binary);
		System.out.println("after swap "+swapBinary);
		String result=Utility.binToDecimal(swapBinary);
		System.out.println(result);
	}

}
