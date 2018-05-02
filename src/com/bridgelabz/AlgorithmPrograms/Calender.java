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
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		int d=Utility.dayOfWeek(date,month,year);
		Utility.day(d);

	}

}
