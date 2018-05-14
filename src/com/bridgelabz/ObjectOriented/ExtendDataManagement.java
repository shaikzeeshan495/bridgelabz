/******************************************************************************
 *  Purpose:	DataManagement using json
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   10-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

public class ExtendDataManagement {
	public static List<String> list2 = new ArrayList<String>();
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();

		dataManagementImplementation dmImp=new dataManagementImplementation();
		System.out.println("Enter no of products");
		int numberProducts=Utility.inputInteger();
		for(int i=0;i<numberProducts;i++)
		{
		System.out.println("enter name of product");
		String type=Utility.inputString();
		System.out.println("enter no of types");
		int noOfTypes=Utility.inputInteger();
		for(int j=0;j<noOfTypes;j++)
		{
			dmImp.add(type);
		}
		}
		dmImp.save();		
	}

}
