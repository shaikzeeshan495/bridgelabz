
package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.utility.Utility;

public class SortsearchTime {

	public static void main(String[] args) {
		
		int mTime[]=new int[6];
		for(int i=0;i<6;i++)
		{
		  System.out.println("Select Input type In Which You Want To Enter Number:-");
	      System.out.println("binarySearch method for integer enter 1 :");
	      System.out.println("binarySearch method for string enter 2 :");
	      System.out.println("insertionSort method for integer enter 3 :");
	      System.out.println("insertionSort method for string enter 4 :");
	      System.out.println("bubbleSort method for integer enter 5 :");
	      System.out.println("bubbleSort method for string enter 6 :");
	      int choice=Utility.inputInteger();
	      switch(choice)
	      {
	      case 1:Utility.binaryIntegers();
	      		break;
	      case 2:Utility.binaryStrings();
	      		break;
	      case 3:System.out.println("enter the length of the array");
				int length=Utility.inputInteger();
				int array[]=new int[length];
				Utility.sorting(array);
				break;
	      
	      case 4:System.out.println("enter the length of the array");
				int lengthInsertion=Utility.inputInteger();
				String arrayInsertion[]=new String[lengthInsertion];
				Utility.sortingString(arrayInsertion);
				break;
	      case 5:System.out.println("enter the length of the array");
				int lengthBubble=Utility.inputInteger();
				int arrayBubble[]=new int[lengthBubble];
				Utility.sorting(arrayBubble);
				break;
	      case 6:System.out.println("enter the length of the array");
				int lengthBubbleStr=Utility.inputInteger();
				String arrayBubbleStr[]=new String[lengthBubbleStr];
				Utility.sortingBubbleString(arrayBubbleStr);
				break;
	      default:System.out.println("invalid");
	      		break;
	      }
		}
	}

}
