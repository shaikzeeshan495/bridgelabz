/******************************************************************************
 *  Purpose:	Hash map
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   4-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import java.io.File;
import com.bridgelabz.utility.Utility;

public class HashMain {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the size");
		int size = Utility.inputInteger();
		Hashchaining linkedHash = new Hashchaining(size);
		File file = new File("HashingFile");
		String readFileStore =Utility.readFile(file);
		for (String fileString : readFileStore.split("\\s", 0)) 
		{
			int number = Integer.parseInt(fileString);
			linkedHash.insert(number);
		}
		
		linkedHash.display();
		System.out.println("Find the number to be searched");
		int value = Utility.inputInteger();
		linkedHash.search(value);
		linkedHash.display();
		linkedHash.write();
	}

}
