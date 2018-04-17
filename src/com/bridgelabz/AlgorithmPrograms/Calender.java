/******************************************************************************
 *  Purpose:	To find the Day of Week
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.CalenderFun;
import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		
		System.out.println("Please enter the date");
		int date=Utility.inputInteger();
		System.out.println("Please enter the month");
		int mon=Utility.inputInteger();
		System.out.println("Please enter the year");
		int year=Utility.inputInteger();
		CalenderFun.dayOfWeek(date,mon,year);

	}

}
