/******************************************************************************
 *  Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class UserName {	
	
	public static void main(String[] args) {			
			System.out.println("Please enter the user name");
			String name=Utility.inputString();
			String input="Hello <<UserName>>, How are you?";
			String afterReplaced=Utility.replacing(input,name);
			System.out.println(afterReplaced);
					
		}

}
