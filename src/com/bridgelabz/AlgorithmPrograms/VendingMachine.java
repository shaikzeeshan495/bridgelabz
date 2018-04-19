/******************************************************************************
 *  Purpose:	Vending Machine(to count notes).
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		
		System.out.println("enter a amount");
		int amount=Utility.inputInteger();
		int result=Utility.countingNotes(amount);
		System.out.println("Total notes "+result);

	}

}
