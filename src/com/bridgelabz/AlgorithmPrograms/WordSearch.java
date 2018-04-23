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
			
		FileReader fileRead=new FileReader("/home/bridgeit/zeeshan/wordsearch.txt");
		BufferedReader br=new BufferedReader(fileRead);
		String fileStr=br.readLine();
		System.out.println(fileStr);
		String []str=fileStr.split("\\s");
		String sortArr[]=Utility.sortingWords(str);
		String sortString=Arrays.toString(sortArr);
		System.out.println(sortString);
		System.out.println("enter a word to search");
		String key=Utility.inputString();
		Utility.binarySearchGeneric(sortArr,0,sortArr.length-1,key);
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
