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
		
		/**
	    * Static function to check the number of triples that sum to exactly 0. 
	    *
	    * @param array the array to read input.
	    */
		static void triplets(int array[])
		{
			int count=0;
		System.out.println("enter integers in array");
		for(int i=0;i<array.length;i++)
			array[i]=Utility.inputInteger();
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				for(int k=0;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
					{
						count++;
						System.out.println(array[i]+" "+array[j]+" "+array[k]);
					}
				}
			}
		}
		
		System.out.println("Total number of triplets "+count);
	}
		
			/*
		    * The main function is to take length of the array.
		    */
		public static void main(String[] args) {
			System.out.println("Please enter the length of array");
			int number=Utility.inputInteger();
			int array[]=new int[number];
			triplets(array);
		}

}
