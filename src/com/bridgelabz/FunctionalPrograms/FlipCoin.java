/******************************************************************************
 *  Purpose: Flip Coin and print percentage of Heads and Tails
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class FlipCoin {
		/*
	    * The main function is to take input number from user.
	    */	
	
	public static void main(String[] args){	
		System.out.println("Please the number of times to Flip Coin");
		int numberOfTimes=Utility.inputInteger();
		Utility.flip(numberOfTimes);	
	}

}
