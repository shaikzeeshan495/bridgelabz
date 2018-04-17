/******************************************************************************
 *  Purpose:	Insertion Sort
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;
import com.bridgelabz.utility.InsertionFunc;
import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		int length=Utility.inputInteger();
		int array[]=new int[length];
		InsertionFunc.sorting(array);
	}

}
