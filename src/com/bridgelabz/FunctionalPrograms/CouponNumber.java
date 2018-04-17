/******************************************************************************
 *  Purpose:to generate random number and to process distinct coupons.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   16-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.FunctionalPrograms;
import com.bridgelabz.utility.Utility;
import java.util.Random;

public class CouponNumber {
		/**
	    * Static function to generate random number and to process distinct coupons. 
	    *
	    * @param number the number is to generate random number.
	    */
	static void randomnumber(int number)
	{
		int count=0;
		int array[]=new int[number];
		for(int i=0;i<number;i++)
		{
			Random r=new Random();
			int temp=r.nextInt(10);
			count++;
			array[i]=temp+1;
			for(int j=0;j<i;j++)
			{
				if(array[i]==array[j])
				{
					i--;
					break;
				}
			}
		
		}
		
			for(int i=0;i<number;i++)
				System.out.print(array[i]+" ");
		System.out.println();
		System.out.println(count);
	}
	
		/*
	    * The main function is to take input numbers to generate the no of coupons.
	    */	
	public static void main(String[] args) {
		System.out.println("enter the number of coupon to generate");
		int number=Utility.inputInteger();
		randomnumber(number);
	}

}

