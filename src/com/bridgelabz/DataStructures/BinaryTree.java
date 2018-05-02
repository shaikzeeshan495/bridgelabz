/******************************************************************************
 *  Purpose:	Binary Tree
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   02-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class BinaryTree {

	public static void main(String[] args) {
		System.out.println("Enter no of test cases");
		int testCase=Utility.inputInteger();
		
		for(int i=0;i<testCase;i++)
		{
		System.out.println("enter number");
		int number=Utility.inputInteger();
		int result=Utility.catalan(number);
		System.out.println(result);
		}
		
		System.out.println("Completed");

	}

}
