package com.bridgelabz.utility;

public class InsertionFunc {
	
		/**
	    * Static function to sort numbers.
	    */
	public static void sorting(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		
		for(int i=0;i<array.length;i++)
		{
			int key=array[i],temp;
			for(int j=i-1;j>=0;j--)
			{
				if(key<array[j])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		printOrder(array);
	}
		
		/**
	    * Static function to print order numbers.
	    */
	static void printOrder(int array[])
	{
	for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
	}
}
