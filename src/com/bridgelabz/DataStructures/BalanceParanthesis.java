/******************************************************************************
 *  Purpose:	Balanced Paranthesis
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   26-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.DataStructures;

public class BalanceParanthesis {

	public static void main(String[] args) {
	
	//	System.out.println("Enter a input");
	//	String input=Utility.inputString1();
		String input="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		char inputArray[]=input.toCharArray();
		char c1='(',c2=')';
		Stack stack=new Stack(inputArray.length);
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]==c1)
				Stack.push(inputArray[i]);
			else if(inputArray[i]==c2)
			{
				boolean flag=Stack.pop();
				if(flag==false)
				{
					System.out.println("Unbalanced Paranthesis");
					System.exit(0);
				}
			}
		}	
		
		System.out.println();
		boolean result=Stack.isEmpty();
		if(result)
			System.out.println("Balanced Paranthesis");
		else
			System.out.println("Unbalanced Paranthesis");
	}


}
