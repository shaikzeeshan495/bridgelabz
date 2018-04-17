/******************************************************************************
 *  Purpose:	To check weather leap year or not.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class LeapYear {

		/**
	    * Static function to check a leap year. 
	    *
	    * @param number the number is year to check for a leap year.
	    */	
	static void isLeap(int year)
		{
			boolean isLeapYear=false;
    	if(year%4==0)
    	{
    		if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                	isLeapYear = true;
                else
                	isLeapYear = false;
            }
            else
            	isLeapYear = true;
        }
        else {
        	isLeapYear = false;
        }

        if(isLeapYear==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
		
		/*
	    * The main function is to take input number as a year from user.
	    */
		public static void main(String[] args) {
	    	System.out.println("Enter a Year:");
	    	int year = Utility.inputInteger();
			isLeap(year);
		}
}