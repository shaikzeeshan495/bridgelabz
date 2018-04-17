/******************************************************************************
 *  Purpose:	prints a table of the powers of 2
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class PowerTwo {
	
		/**
	    * Static function to give value of power 2 and check for leap year. 
	    *
	    * @param number the number is power to give value of power 2.
	    */
		static void powerValue(int power){		
		double year=0;
		boolean isLeapyear=false;
		for(int i=1;i<=power;i++)
		{
    	year = Math.pow(2, i);
    	if(year%4==0)
    	{
    		if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                	isLeapyear = true;
                else
                	isLeapyear = false;
            }
            else
            	isLeapyear = true;
        }
        else 
        	isLeapyear = false;

        if(isLeapyear==true)
            System.out.println("2 power "+i+" is "+ year + " is a Leap Year.");
        else
            System.out.println("2 power "+i+" is "+ year + " is not a Leap Year.");
		}
		
    }
			
			/*
		    * The main function is to take input number as a power N.
		    */
		public static void main(String[] args) {
			System.out.println(" The Power Value N");
			int power=Utility.inputInteger();
			powerValue(power);
		}
		
}
