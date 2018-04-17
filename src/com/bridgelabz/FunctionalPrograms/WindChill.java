/******************************************************************************
 *  Purpose:	To calculate the temperature and the wind speed and find the weather.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class WindChill {
		
		/**
	    * Static function to find the weather.
	    *
	    * @param numbers the numbers is to calculate the temperature.
	    */
		static void weather(int t,int v)
		{
		
		double w=0;
		if(t<=50 && v<=120 && v>=3)
		{
			w=35.74 + (0.6215*t) + ((0.4275*t)-35.75)*Math.pow(v, 0.16);
			System.out.println(w);
		}
		else
			System.out.println("please enter valid input");
		
	}
		
			/*
		    * The main function is to take input numbers to calculate temperature.
		    */
		public static void main(String[] args) {

			System.out.println("please enter the temperature t (in Fahrenheit)");
			int t=Utility.inputInteger();
			System.out.println("please enter the wind speed v (in miles per hour)");
			int v=Utility.inputInteger();
			weather(t,v);
		}

}
