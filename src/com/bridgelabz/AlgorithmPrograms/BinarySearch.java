package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.SearchBinary;
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
		System.out.println("Enter the word to search");
		String key=Utility.inputString();
		int result=SearchBinary.searchingKey(key,0,count-1, array);
		System.out.println(result);
	}

}
