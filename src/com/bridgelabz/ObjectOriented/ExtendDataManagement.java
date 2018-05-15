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
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

public class ExtendDataManagement {
	public static List<String> list2 = new ArrayList<String>();
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
	
		dataManagementImplementation dmImp=new dataManagementImplementation();
//		System.out.println("Enter no of products");
//		int numberProducts=Utility.inputInteger();
		String type="";
		System.out.println("The InventoryManager has three types of product ");
		for(int i=0;i<3;i++)
		{
		System.out.println("Select one  of the product\n1 for rice\n2 for wheat\n3 for pulses");
		int choice=Utility.inputInteger();
		switch(choice)
		{
		case 1:type="rice";
		break;
		case 2:type="wheat";
		break;
		case 3:type="pulses";
		break;
		default: System.out.println("invalid input");
				System.exit(0);
				break;
		}
		System.out.println("enter no of types");
		int noOfTypes=Utility.inputInteger();
		
		for(int j=0;j<noOfTypes;j++)
		{
			dmImp.add(type);
		}
		
	}
		dmImp.save();	
		dmImp.Calculation();
	}
	

}
