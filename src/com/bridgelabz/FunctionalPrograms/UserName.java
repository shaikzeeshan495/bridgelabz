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
				
		/**
	    * Static Function to read input String from user and printing them out to standard output. 
	    *
	    * @param String the String to replace in the Line
	    */		
	
	static void function(String str)
		{
		char ch[]=str.toCharArray();
		if(ch.length<3)
			System.out.println("UserName must have min 3 char");
		else
			System.out.println("Hello "+str+", How are you?”");
		}
		
		/*
	    * The main function is to take input String from user.
	    */	
	public static void main(String[] args) {			
			System.out.println("Please enter the user name");
			String str=Utility.inputString();
			function(str);		
		}

}
