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
		
		for(int i=0;i<arrayTwoD.length;i++)
		{
			for(int j=0;j<arrayTwoD[i].length;j++)
			{
				if(arrayTwoD[i][j]!=0)
					System.out.print(arrayTwoD[i][j]+" ");
			}
			System.out.println();
		}
	}

}
