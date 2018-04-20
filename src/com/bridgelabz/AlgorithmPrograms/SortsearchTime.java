/******************************************************************************
 *  Purpose:	To check the time of searching and sorting methods
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   19-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class SortsearchTime {

	public static void main(String[] args) {
		
		
		String str[]={"america","europe","india","london","riyadh"};
		int array[]={45,69,72,79,88,95};
		long timeBinaryInteger=Utility.binaryStopwatchInt(array,88);
		long timeBinaryString=Utility.binaryStopwatchStr(str,str[2]);
		long timeInsertInteger=Utility.insertStopwatchInt(array);
		long timeInsertString=Utility.insertStopwatchStr(str);
		long timeBubbleInteger=Utility.bubbleStopwatchInt(array);
		long timeBubbleString=Utility.bubbleStopwatchStr(str);
		System.out.println("Time of Binary Integers search " +timeBinaryInteger+ " Nano seconds");
		System.out.println("Time of Binary Strings search " +timeBinaryString+ " Nano seconds");
		System.out.println("Time of Insertion sort Integers search " +timeInsertInteger+ " Nano seconds");
		System.out.println("Time of Insertion sort Strings search " +timeInsertString+ " Nano seconds");
		System.out.println("Time of Bubble sort Integers search " +timeBubbleInteger+ " Nano seconds");
		System.out.println("Time of Bubble sort Strings search " +timeBubbleString+ " Nano seconds");


	}

}
