/******************************************************************************
 *  Purpose: A library for reading in 2D arrays.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.FunctionalPrograms;

import com.bridgelabz.utility.Utility;

public class TwodArray {
		
		/*
	    * The main function is create 2 dimensional array in memory to read in M rows and N cols
	    */
		public static void main(String[] args) {
			
			System.out.println("Select Input type In Which You Want To Enter Number:-");
		      System.out.println("1:-Enter the number in Integer ");
		      System.out.println("2:-Enter the number in Double ");
		      System.out.println("3:-Enter the number in Boolean ");
		      int choice=Utility.inputInteger();
		      
		      switch(choice)
		      {
		      case 1:Utility.arrayInteger();
		      			break;
		      case 2:Utility.arrayDouble();
    					break;
		      case 3:Utility.arrayBoolean();
    					break;
		      default:System.out.println("invalid input");
    					break;
		      
		      }
		      
		}

}
