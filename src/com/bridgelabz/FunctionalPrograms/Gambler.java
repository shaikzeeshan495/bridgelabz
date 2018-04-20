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
		Utility.game(stake,goal,numberOfTimes);	
	}

}
