/******************************************************************************
 *  Purpose:	Stopwatch(to count time).
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class Stopwatch {	
		/*
	    * The main function is to take input numbers to start and stop stopwatch.
	    */
		public static void main(String[] args) {		
			
			System.out.println("Please enter any number to start");
			Utility.inputInteger();
			Utility.start();
			System.out.println("Please enter any number to stop");
			Utility.inputInteger();
			Utility.stop();
			long sec=Utility.getElapsedTimesec();
			System.out.println(sec+" sec");	
		}

}
