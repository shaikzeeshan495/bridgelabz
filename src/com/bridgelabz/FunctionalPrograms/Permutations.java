/******************************************************************************
 *  Purpose: Permutations of a String.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   21-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

public class Permutations {

	public static void main(String[] args) {
		
		System.out.println("enter a String");
		String str=Utility.inputString();
        int n = str.length();
        
        Utility.permute(str, 0, n-1);
		

	}

}
