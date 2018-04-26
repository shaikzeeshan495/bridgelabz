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

public class BalancedParenthesis2 {

	public static void main(String[] args) {
		StackLinked stack=new StackLinked();
		System.out.println(stack.isEmpty());
		System.out.println("Enter a input");
		String input=Utility.inputString1();
		String array[]=input.split("\\s");
		for(int i=0;i<array.length;i++)
		{
		//	if(array[i]=="(")
			stack.add(array[i]);
	//		else
	//			stack.pop();
		}
		stack.display();
		stack.pop();
		System.out.println();
		stack.display();
		System.out.println();
		System.out.println(stack.isEmpty());	
		

	}

}
