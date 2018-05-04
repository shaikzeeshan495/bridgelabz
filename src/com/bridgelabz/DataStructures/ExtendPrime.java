/******************************************************************************
 *  Purpose:	Finding annagram from prime numbers.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   03-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class ExtendPrime {

	public static void main(String[] args) {
		int tempArray[]=Utility.primeNum(1000);
		int position=0;
		int count=0,index=0;
		System.out.println("Prime numbers are");
		int array[]=Utility.extendAnnagram(tempArray);
		//temporary initializing length 
		int tempAnnagram[]=new int[500];
		//Collecting annagram in temporary array.
		String tempString1="";
		String tempString2="";
		for(int i=0;i<array.length-1;i++)
		{
			for(int k=i+1;k<array.length;k++)
			{
				tempString1=""+array[i];
				tempString2=""+array[k];
				boolean flag=Utility.annagFunNum(tempString1,tempString2);
				if(flag)
				{
					tempAnnagram[position++]=array[i];
					tempAnnagram[position++]=array[k];
					count=count+2;
				}
				
			}
			
		}
	
		int resultArray[][]=new int[count][2];
		//Collecting Annagram.
		for(int i=0;i<count;i++)
		{
			resultArray[i][0]=tempAnnagram[i];
		}
		//Collecting Non Annagram.
		for(int i=1;i<array.length;i++)
		{
			boolean flag=Utility.check(array[i],count,resultArray);
			if(flag)
			{
				resultArray[index][1]=array[i];
				index++;
			}	
		}
	
		System.out.println("Annagram\tNot a annagram");
		//Printing the Annagram and Non Annagram array.
		for(int i=0;i<resultArray.length;i++)
		{
			for(int j=0;j<resultArray[i].length;j++)
			{
				if(resultArray[i][j]!=0)	
				{
					System.out.print(resultArray[i][j]+"\t\t");
				}
				
			}
			System.out.println();
		}

	}

}
