/******************************************************************************
 *  Purpose:	Bubble Sort
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	public static void main(String []args)
	{
		System.out.println("enter the length of the array");
		int len=Utility.inputInteger();
		int tempArray[]=new int[len];
		System.out.println("enter the elements");
		int array[]=Utility.inputIntArray(tempArray);
		int afterSortBuble[]=Utility.sortBubble(array);
		Utility.printNum(afterSortBuble);
}

}
