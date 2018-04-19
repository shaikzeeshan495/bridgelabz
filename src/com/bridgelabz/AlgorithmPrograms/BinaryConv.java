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

public class BinaryConv {

	public static void main(String[] args) {
		System.out.println("enter a decimal number");
		int decimal=Utility.inputInteger();
		//int array[]=Utility.toBinary(decimal);
		//for(int i=0;i<array.length;i++)
			//System.out.print(array[i]+" ");
		String result=Utility.toBinary(decimal);
		System.out.println(result);
		System.out.println(result.length());

	}

}
