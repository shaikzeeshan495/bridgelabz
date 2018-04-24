package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class UnorderMain {
	
public static void main(String[] args) {
		
		try{
			UnorderedList list=new UnorderedList();
			FileReader fileRead=new FileReader("/home/bridgeit/zeeshan/Files/UnorderedList.txt");
			BufferedReader br=new BufferedReader(fileRead);
			String fileStr=br.readLine();
			System.out.println(fileStr);
			String []str=fileStr.split("\\s");
			System.out.println("Enter the word");
			String word=Utility.inputString();
			list.operation(word,str);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
