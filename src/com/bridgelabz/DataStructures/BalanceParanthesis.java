/******************************************************************************
 *  Purpose:	Balanced Paranthesis
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   26-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class BalanceParanthesis {

	public static void main(String[] args) {
	
		System.out.println("Enter a input");
		String input=Utility.inputString1();
		String inputArray[]=input.split("\\s");
	//	System.out.println("Length of Stack "+inputArray.length);
		Stack stack=new Stack(inputArray.length);
	//	System.out.println(Arrays.toString(array));
		StackLinked.SIZE=inputArray.length;
		
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]=="(")
			stack.push(inputArray[i]);
			else
				stack.pop();
		}
		System.out.println();
	}

}
