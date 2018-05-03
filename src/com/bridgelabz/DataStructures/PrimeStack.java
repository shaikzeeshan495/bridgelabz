package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class PrimeStack {

	public static void main(String[] args) {
		int tempArray[]=Utility.primeNum(1000);
		int z=0;
		int count=0;
		System.out.println("Prime numbers are");
		int array[]=Utility.extendAnnagram(tempArray);
		int tempAnnagram[]=new int[500];
		
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
		int AnnagramArray[]=new int[count];
		for(int i=0;i<count;i++)
		{
			AnnagramArray[i]=tempAnnagram[i];
		}
		StackLinked stack=new StackLinked();
		
		for(int i=0;i<count;i++)
		{
			stack.push(AnnagramArray[i]);
		}
		
		System.out.println("Displaying annagrams using Stack.");
		stack.display();

	}

}
