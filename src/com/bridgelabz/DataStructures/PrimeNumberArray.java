/******************************************************************************
 *  Purpose:	prime numbers collecting in two D array.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   03-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class PrimeNumberArray {
	public static void main(String []args)
	{
		int count=1;
		int row=0,column=0;
		int arrayTwoD[][]=new int[10][26];
		int primeArray[]=Utility.primeNum(1000);
		System.out.println("Prime numbers are");
		//Collecting prime numbers in 2D array.
		for(int i=0;i<primeArray.length;i++)
		{
			if(primeArray[i]!=0)
			{
				row=primeArray[i]/100;
				if(row==count)
				{
					count++;
					column=0;
				}
				arrayTwoD[row][column++]=primeArray[i];
			}
		}	
		//Printing prime numbers from 2D array.
		for(int i=0;i<arrayTwoD.length;i++)
		{
			for(int j=0;j<arrayTwoD[i].length;j++)
			{
				if(arrayTwoD[i][j]!=0)
					System.out.print(String.format("%5d", arrayTwoD[i][j]));
			}
			System.out.println();
		}
	}

}
