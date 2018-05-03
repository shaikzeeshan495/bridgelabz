package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class ExtendPrime {

	public static void main(String[] args) {
		int tempArray[]=Utility.primeNum(1000);
		int z=0;
		int count=0,index=0;
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
		int nonAnnagram[]=new int[count];
		for(int i=0;i<count;i++)
		{
			AnnagramArray[i]=tempAnnagram[i];
		}
	
		int resultArray[][]=new int[count][2];
		for(int i=1;i<count;i++)
		{
			resultArray[i][0]=AnnagramArray[i-1];
		}
	
		
		for(int i=1;i<array.length;i++)
		{
			boolean flag=Utility.check(array[i],count,AnnagramArray);
			if(flag)
			{
				nonAnnagram[index]=array[i];
				index++;
			}	
		}
	
		for(int i=1;i<count;i++)
		{
			resultArray[i][1]=nonAnnagram[i-1];
		}
		System.out.println("Annagram\tNot a annagram");
		
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
