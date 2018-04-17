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

	static long START_TIME=0;
	static long STOP_TIME=0;
	boolean running=false;
	
		/**
	    * Function to start time
	    */
		public void start()
		{
			START_TIME=System.currentTimeMillis();
			running=true;
		}
		
		/**
	    * Function to stop time
	    */
		public void stop()
		{
			STOP_TIME=System.currentTimeMillis();
			running=false;
		}
		
		/**
		* Function to calculate time in millisec.
	    */
		public long getElapsedTime() {
		    long elapsed;
		    if (running) 
		      elapsed = (System.currentTimeMillis() - START_TIME);
		    else 
		      elapsed = (STOP_TIME - START_TIME);
		    return elapsed;
		}
		
		/**
		* Function to calculate time in sec.
	    */
		public long getElapsedTimesec() {
		    long elapsed;
		    
		    if (running) 
		      elapsed = ((System.currentTimeMillis() - START_TIME)/1000);
		    else 
		      elapsed = ((STOP_TIME - START_TIME)/1000);
		    return elapsed;
		}
		
		/*
	    * The main function is to take input numbers to start and stop stopwatch.
	    */
		public static void main(String[] args) {		
			Stopwatch stopwatch=new Stopwatch();
			System.out.println("Please enter any to start");
			int number1=Utility.inputInteger();
			stopwatch.start();
			System.out.println("Please enter any to start");
			int number2=Utility.inputInteger();
			stopwatch.stop();
			System.out.println(stopwatch.getElapsedTimesec()+" sec");
			System.out.println(stopwatch.getElapsedTime()+" millisec");	
		}

}
