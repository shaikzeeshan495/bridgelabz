
/******************************************************************************
 *  Purpose:	To find is it annagran or not.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;
import com.bridgelabz.utility.AnnagramFun;
import com.bridgelabz.utility.Utility;

public class Annagram {

	public static void main(String[] args) {
		
		System.out.println("Please enter two Strings");
		String str1=Utility.inputString();
		String str2=Utility.inputString();
		AnnagramFun.annagramFun(str1, str2);
	}
	

}
