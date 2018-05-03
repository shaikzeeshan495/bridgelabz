package com.bridgelabz.DataStructures;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

public class HashMain {

	public static void main(String[] args) throws IOException {
		HashFunction hash=new HashFunction();
		hash.objects();
		File file=new File("/home/bridgeit/zeeshan/Files/Hashing.txt");
		String fileString=Utility.readFile(file);
		System.out.println(fileString);
		String []stringArray=fileString.split("\\s");
		for(int i=0;i<stringArray.length;i++)
		{
			Integer data=Integer.parseInt(stringArray[i]);
			hash.operation(data);
		}
		hash.display();
		System.out.println("Enter a number to search");
		Integer key=Utility.inputInteger();
		boolean flag=hash.search(key);
		if(flag==false)
			hash.operation(key);
		hash.display();

	}

}
