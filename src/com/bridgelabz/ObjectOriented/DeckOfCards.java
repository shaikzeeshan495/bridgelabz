/******************************************************************************
 *  Purpose:	Deck Of Cards
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   11-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.ObjectOriented;

import com.bridgelabz.utility.Utility;

public class DeckOfCards {
	  public static void main(String[] args) {
		  String [][]resultArray=Utility.deckOfCards();
		
		  //Display the all cards from 2Darray.
		    System.out.println("Person 1	    "+"Person 2		"+"Person 3	    "+"Person 4");
		    System.out.println("-------------------------------------------------------------------------------------");
		    for(int row=0;row<resultArray.length-1;row++)
		    {
		    	for(int column=0;column<resultArray[row].length-1;column++)
		    	{
		    		String line = String.format("%1$-20s", resultArray[row][column]);
		    		System.out.print(line);
		    	}
		    	System.out.println();
		    }
	   
	  }
	}
