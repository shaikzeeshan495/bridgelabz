/******************************************************************************
 *  Purpose:	Unordered Linked List
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   23-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import java.io.File;
import java.io.IOException;
import com.bridgelabz.utility.Utility;

public class UnorderMain {
	
public static void main(String[] args) {
		
		try{
			UnorderedList<?> list=new UnorderedList<Object>();
			File file=new File("/home/bridgeit/zeeshan/Files/UnorderedList.txt");
			String fileString=Utility.readFile(file);
			System.out.println(fileString);
			String []stringArray=fileString.split("\\s");
			System.out.println("Enter the word");
			String word=Utility.inputString();
			list.operation(word,stringArray);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
