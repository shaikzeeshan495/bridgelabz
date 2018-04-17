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
	
		/**
	    * Static function to Flip the coin. 
	    *
	    * @param number the number is for how many times to flip the coin
	    */
	
	static void flip(int numberOfTimes)
	{
		int heads=0,tails=0;
		if(numberOfTimes>=0)
		{
			for(int flip=1;flip<=numberOfTimes;flip++)
			{
				if(Math.random()<0.5)
					tails++;
				else
					heads++;
			}
		}
		
		else
			System.out.println("enter the positive integer");
		
		System.out.println("Percentage of head "+100.0*heads/numberOfTimes);
		System.out.println("Percentage of tails "+100.0*tails/numberOfTimes);		
	}
	
		/*
	    * The main function is to take input number from user.
	    */	
	
	public static void main(String[] args){	
		System.out.println("Please the number of times to Flip Coin");
		int numberOfTimes=Utility.inputInteger();
		flip(numberOfTimes);	
	}

}
