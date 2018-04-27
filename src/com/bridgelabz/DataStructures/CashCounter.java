/******************************************************************************
 *  Purpose:	Banking Cash Counter
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   27-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class CashCounter {

	public static void main(String[] args) {
		System.out.println("give initial bank amount");
		int bankCash=Utility.inputInteger();
		Queue queue=new Queue(20,bankCash);
		while(bankCash<=0)
		{
			System.out.println("Enter 1 for deposit");
			System.out.println("Enter 2 for withdraw");
			int choice=Utility.inputInteger();
			switch(choice)
			{
			case 1:System.out.println("Enter the amount to deposit");
					int depositCash=Utility.inputInteger();
					queue.enqueue(depositCash);
					queue.counter("deposit");
					break;
			case 2:System.out.println("Enter the amount to withdraw");
					int withDrawCash=Utility.inputInteger();
					queue.enqueue(withDrawCash);
					queue.counter("withDraw");
					break;
			
			}
		}

	}

}
