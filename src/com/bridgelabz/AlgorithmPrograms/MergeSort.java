/******************************************************************************
 *  Purpose:	Merger Sort
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Enter the length array");
		int length=Utility.inputInteger();
		int array[]=new int[length];
		System.out.println("enter the elements");
		for(int i=0;i<array.length;i++)
			array[i]=Utility.inputInteger();
		int arr[]=Utility.sortMergeNum(array,0,length-1);
		System.out.println("after swaping");
		Utility.printArray(arr);

	}

}
