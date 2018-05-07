package com.bridgelabz.DataStructures;
import java.io.File;
import java.io.IOException;
import com.bridgelabz.utility.Utility;

public class Hash2 {

	public static void main(String[] args) throws IOException {
		HashFunction2 hash=new HashFunction2();
		hash.objects();
		File file=new File("/home/bridgeit/zeeshan/Files/Hashing.txt");
		String fileString=Utility.readFile(file);
		System.out.println(fileString);
		String []stringArray=fileString.split("\\s");
		for(int i=0;i<stringArray.length;i++)
		{
			Integer data=Integer.parseInt(stringArray[i]);
			hash.operationAdd(data);
		}
		hash.display();
		System.out.println("Enter a number to search");
		Integer key=Utility.inputInteger();
		boolean flag=hash.search(key);
		if(flag==false)
			hash.operationAdd(key);
	//	hash.operateMap();
		hash.display();
	}

}
