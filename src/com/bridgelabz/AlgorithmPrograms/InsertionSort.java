/******************************************************************************
 *  Purpose:	Insertion Sort
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.AlgorithmPrograms;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		int length=Utility.inputInteger();
		int tempArray[]=new int[length];
		System.out.println("Enter the elements:");
		int array[]=Utility.inputIntArray(tempArray);
		int arrayAfterSort[]=Utility.inSorting(array);
		Utility.printOrder(arrayAfterSort);
	System.out.println(Arrays.toString(arrayAfterSort));
		
	}

}
