package com.bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class OrderMain {
	
	public static void main(String[] args) {
		
		try{
			OrderedList list=new OrderedList();
			FileReader fileRead=new FileReader("/home/bridgeit/zeeshan/Files/OrderedList.txt");
			BufferedReader br=new BufferedReader(fileRead);
			String fileStr=br.readLine();
			System.out.println(fileStr);
			String []str=fileStr.split("\\s");
			String []sortArray=Utility.sortBubbleGeneric(str);
			System.out.println("After Sorting");
			System.out.println(Arrays.toString(sortArray));
			System.out.println("Enter the Number");
			String number=Utility.inputString();
			list.operation(number, sortArray);
		
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}

	}

}
