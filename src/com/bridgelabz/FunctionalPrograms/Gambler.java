/******************************************************************************
 *  Purpose:gambler who start with stake and place fair $1 bets until he/she goes broke or reach $goal.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;

public class Gambler {
		/**
	    * Static function to Play till the gambler is broke or has won 
	    *
	    * @param number the number is initial amount.
	    * @param number the number is goal.
	    * @param number the number is number of times to play.
	    */
	static void game(int stake,int goal,int numberOfTimes)
	{	
		int loss=0;
		int wins=0;
		for(int i=1;i<numberOfTimes;i++)
		{
			int amount=stake;
			while(amount>0 && amount<goal)
			{
			
				if(Math.random()>0.5)
					amount++;
				else
					amount--;
			}
				if(amount==goal)
					wins++;
				else
					loss++;
		}
		System.out.println("Total number of wins: "+wins);
		System.out.println("Percentage of Win "+100.0*wins/numberOfTimes);
		System.out.println("Percentage of Loss"+100.0*loss/numberOfTimes);	
	}
	
		/*
	    * The main function is to take input numbers as $stake,$goal and number of times to play.
	    */	
	public static void main(String[] args) {	
		System.out.println("Please enter the stack");
		int stake=Utility.inputInteger();
		System.out.println("Please enter the Goal");
		int goal=Utility.inputInteger();
		System.out.println("Please enter number of times");
		int numberOfTimes=Utility.inputInteger();
		game(stake,goal,numberOfTimes);	
	}

}
