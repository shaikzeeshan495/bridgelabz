
package com.bridgelabz.utility;

public class BubbleFunc {
	
		/**
	    * Static function to sort numbers.
	    */
	public static void sorting(int array[])
	{
		int temp=0;
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputInteger();
		}
		
		for(int i=0;i<array.length-2;i++)
		{
			for(int j=0;j<=array.length-2-i;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		printNum(array);
	}
	
		/**
	    * Static function to print order numbers.
	    */
	static void printNum(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
	}
		
}
