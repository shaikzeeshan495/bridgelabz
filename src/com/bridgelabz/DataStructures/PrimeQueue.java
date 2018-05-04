/******************************************************************************
 *  Purpose:	Finding annagram from prime numbers and store in queue.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   03-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class PrimeQueue {

	public static void main(String[] args) {
		int tempArray[]=Utility.primeNum(1000);
		int z=0;
		int count=0;
		System.out.println("Prime numbers are");
		//From prime numbers collecting correct size of array.
		int array[]=Utility.extendAnnagram(tempArray);
		//initializing temporary array
		int tempAnnagram[]=new int[500];
		//Finding annagram from prime numbers and collecting in tempAnnagram array
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
					tempAnnagram[z++]=array[i];
					tempAnnagram[z++]=array[k];
					count=count+2;
				}
				
			}
			
		}
		//Initializing array by using coount
		int AnnagramArray[]=new int[count];
		for(int i=0;i<count;i++)
		{
			AnnagramArray[i]=tempAnnagram[i];
		}
		
		QueueLinkedlist queue=new QueueLinkedlist();
		for(int i=0;i<count;i++)
		{
			queue.add(AnnagramArray[i]);
		}
		
		System.out.println("Displaying annagrams using Stack.");
		queue.show();

	}

}
