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
		
			/*
		    * The main function is to take input numbers to calculate temperature.
		    */
		public static void main(String[] args) {

			System.out.println("please enter the temperature t (in Fahrenheit)");
			int t=Utility.inputInteger();
			System.out.println("please enter the wind speed v (in miles per hour)");
			int v=Utility.inputInteger();
			Utility.weather(t,v);
		}

}
