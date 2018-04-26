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
		Stack stack=new Stack(inputArray.length);
	
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i].equals("("))
				stack.push(inputArray[i]);
			else if(inputArray[i].equals(")"))
				stack.pop();
		}
		stack.display();
		System.out.println();
		boolean result=stack.isEmpty();
		if(result)
			System.out.println("Balanced Paranthesis");
		else
			System.out.println("Unbalanced Paranthesis");
	}

}
