
package com.bridgelabz.utility;
import java.util.Arrays;

public class AnnagramFun {

		/**
	    * Static function to check annagram.
	    *
	    * @param arrays the char arrays to check the annagram.
	    */
	public static String checkAnnagram(char ch1[],char ch2[])
	{
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length!=ch2.length)
			return "Not a Annagram";
		else 
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					return "Not a Annagram";
					
				}
			}	
					return "It is a Annagram";
		}
	
	}	
	
		
		/**
	    * Static function to convert strings to char arrays.
	    *
	    * @param string the strings to convert char array.
	    */
	public static void annagramFun(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		String str=checkAnnagram(ch1,ch2);
		System.out.println(str);
	}
	
}
