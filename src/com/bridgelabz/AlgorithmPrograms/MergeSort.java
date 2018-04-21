/******************************************************************************
 *  Purpose:	Merger Sort
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   20-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the length array");
		int length=Utility.inputInteger();
		int tempArray[]=new int[length];
		System.out.println("enter the elements");
		int array[]=Utility.inputIntArray(tempArray);
		
		int arrayResult[]=Utility.sortMergeNum(array);
		
		System.out.println("after sorting");
		Utility.printArray(arrayResult);

	}

}
