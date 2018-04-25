package com.bridgelabz.DataStructures;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Balance2 {

	public static void main(String[] args) {
	
		Stack2 stack2=new Stack2();
		System.out.println("Enter a input");
		String input=Utility.inputString1();
		String array[]=input.split("\\s");
	//	System.out.println(array.length);
	//	System.out.println(Arrays.toString(array));
	//	Stack.SIZE=array.length;
		for(int i=0;i<array.length;i++)
		{
			stack2.push(array[i]);
		}
		System.out.println();
		stack2.display(); 
	}

}
