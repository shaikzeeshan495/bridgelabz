/******************************************************************************
 *  Purpose:Read in N integers and counts the number of triples that sum to exactly 0.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class Triplets {
			
			/*
		    * The main function is to take length of the array.
		    */
		public static void main(String[] args) {
			System.out.println("Please enter the length of array");
			int number=Utility.inputInteger();
			int array[]=new int[number];
			Utility.triplets(array);
		}

}
