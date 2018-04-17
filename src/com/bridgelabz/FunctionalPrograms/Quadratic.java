/******************************************************************************
 *  Purpose:	To find the roots of the equation.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class Quadratic {

		/**
	    * Static function to find the roots of the equation.
	    *
	    * @param numbers the numbers is to calculate the equation.
	    */
	static void findRoots(int a,int b,int c)
	{
		double delta=0;
		double root2=0;
		double root1=0;
		delta= (b*b)-(4*a*c);
		root1= (-b + Math.sqrt(delta))/(2*a);
		root2= (-b - Math.sqrt(delta))/(2*a);
		System.out.println("Root 1 of x = "+root1);
		System.out.println("Root 2 of x = "+root2);
	}
	
		/*
	    * The main function is to take input numbers to calculate equation.
	    */
	public static void main(String[] args) {	
		System.out.println("Enter the input a");
		int a=Utility.inputInteger();
		System.out.println("Enter the input b");
		int b=Utility.inputInteger();
		System.out.println("Enter the input c");
		int c=Utility.inputInteger();
		findRoots(a,b,c);		
	}

}
