/******************************************************************************
 *  Purpose:	Binary Search
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;


import com.bridgelabz.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number of words");
		int count=Utility.inputInteger();
		String array[]=new String[count];
		System.out.println("Enter the words");
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=Utility.inputString();
		}
		
		array=Utility.sortingWords(array);
		
		System.out.println("after sorting: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter the word to search");
		String key=Utility.inputString();
		
		int position=Utility.searchingKey(array, 0, array.length-1,key);
		if(position == -1)
		    System.out.println("Not found");
		  else
		    System.out.println("String found at "+(position+1));
		
	}

}
