/******************************************************************************
 *  Purpose:	To calculate distance.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;
public class Distance {

		/*
	    * The main function is to take input values to calculate distance.
	    */
	public static void main(String[] args) {
		System.out.println("please enter the X and Y coordinates");
		int x = Utility.inputInteger();
		int y=Utility.inputInteger();
		Utility.distance(x,y);		
	}

}
