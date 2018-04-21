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
		String temp[]=new String[count];
		System.out.println("Enter the words");
		String array[]=Utility.inputStringArray(temp);
		
		String []arraySort=Utility.sortingWords(array);
		
		System.out.println("after sorting: ");
		for(int i=0;i<arraySort.length;i++)
		{
			System.out.print(arraySort[i]+" ");
		}
		
		System.out.println();
		System.out.println("Enter the word to search");
		String key=Utility.inputString();
		Utility.searchingKey(array, 0, array.length-1,key);
		
	}

}
