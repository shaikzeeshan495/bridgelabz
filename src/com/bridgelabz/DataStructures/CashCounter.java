/******************************************************************************
 *  Purpose:	Banking Cash Counter
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   27-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

public class CashCounter {

	public static void main(String[] args) {
		int bankCash=100000;
		Queue queue=new Queue(10,bankCash);
		queue.operation();

	}

}
