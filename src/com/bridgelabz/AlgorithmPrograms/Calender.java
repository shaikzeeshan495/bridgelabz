/******************************************************************************
 *  Purpose:	To find the Day of Week
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		int date=Integer.parseInt(args[0]);
		int mon=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
			Utility.dayOfWeek(date,mon,year);
		//System.out.println("Please enter the date");
		//int date=Utility.inputInteger();
		//System.out.println("Please enter the month");
		//int mon=Utility.inputInteger();
		//System.out.println("Please enter the year");
		//int year=Utility.inputInteger();
		

	}

}
