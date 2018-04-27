/******************************************************************************
 *  Purpose: Binary word search
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   20-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class WordSearch {

	public static void main(String[] args) {
		try{
			
		FileReader fileRead=new FileReader("/home/bridgeit/zeeshan/Files/wordsearch.txt");
		BufferedReader bufferRead=new BufferedReader(fileRead);
		String inputFile=bufferRead.readLine();
		System.out.println(inputFile);
		String []stringArray=inputFile.split("\\s");
		String sortArray[]=Utility.sortingWords(stringArray);
		String sortString=Arrays.toString(sortArray);
		System.out.println(sortString);
		System.out.println("enter a word to search");
		String key=Utility.inputString();
		Utility.binarySearchGeneric(sortArray,0,sortArray.length-1,key);
		bufferRead.close();
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
