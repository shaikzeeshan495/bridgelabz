/******************************************************************************
 *  Purpose:	Implementetaion of queue
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   27-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.DataStructures;

import com.bridgelabz.utility.Utility;

public class Queue {
	Object queueArray[];
	int size,rare,front,stackLength;
	static int BANKCASH;
	
	/**Queue function is to intialize the queue.
	 * @param queueLength the lengthy of queue array.
	 * @param bankCash is a number of initial bank amount
	 */
	public Queue(int queueLength,int bankCash)
	{
		BANKCASH=bankCash;
		size=queueLength;
		queueArray=new Object[size];
		rare=-1;
		front=0;
	}
	
	public Queue() {
		// TODO Auto-generated constructor stub
	}

	/**enqueue is a function to add in a queue.
	 * @param element the data to add in a queue.
	 * @return boolean data to ensure queue is empty or not.
	 */
	public <T extends Comparable <T>> boolean enqueue(T element)
	{
		if(rare==size-1)
		{
			System.out.println("Queue was full, insertion not possible");
			return false;
		}
		else{
			queueArray[++rare]=element;
			return true;
		}
	}
	
	/**dequeue function removes front item from queue.
	 * 
	 */
	public <T extends Comparable <T>> void dequeue()
	{
		if(rare==-1||front>rare)
			System.out.println("Queue was empty, deletion not possible");
		else
			front++;
	}
	
	/**display function is to display elements in a queue.
	 * 
	 */
	public <T extends Comparable <T>> void display()
	{
		if(rare==-1||front>rare)
			System.out.println("Queue was empty, Nothing to display");
		else
		{
			for(int i=front;i<=rare;i++)
				System.out.print(queueArray[i]+" ");
		}
	}
	
	/**counter is a function to do transaction operation.
	 * 
	 */
	public <T extends Comparable <T>> void counter()
	{
		
		System.out.println("Enter the 1 amount to deposit");
		System.out.println("Enter the 2 amount to withdraw");
		int input=Utility.inputInteger();
		if(input==1 && BANKCASH>=0)
		{
			System.out.println("enter amount to deposit");
			int depositAmount=Utility.inputInteger();
			BANKCASH=BANKCASH+depositAmount;
			System.out.println("Present Bank cash "+BANKCASH);
			dequeue();
			operation();
			
		}
		else if(input==2 && BANKCASH>=0)
		{
			System.out.println("enter amount to withdraw");
			int withdrawAmount=Utility.inputInteger();
			BANKCASH=BANKCASH-withdrawAmount;
			System.out.println("Present Bank cash "+BANKCASH);
			dequeue();
			operation();	
		}	
		else
		{
			System.out.println("Bank balance is insufficient");
			dequeue();
			operation();
		}
	
	}
	
	/**isEmpty is a function to ensure the queue is empty or not.
	 * @return status of the queue.
	 */
	public boolean isEmpty()
	{
		if(rare==-1||front>rare)
			return true;
		else
			return false;
	}
		
	/**operation is a function is to choose option to enter in a queue or go for transaction.
	 * 
	 */
	public void operation()
	{
		System.out.println("enter 1 to add in a queue");
		System.out.println("enter 2 for transaction");
		int choice=Utility.inputInteger();
		switch(choice)
		{
		case 1: Boolean result=enqueue(1);
				if(result==false)
					System.out.println("Queue was full, go for transaction");	
				else
				{
					System.out.println("You are added in a queue");
					operation();
				}
				break;
	
		case 2:	boolean isempty=isEmpty();
				if(isempty==true)
				{
					System.out.println("Queue was empty, First add queue");
					operation();
				}
				else
					{
						counter();
						break;
					}
				
		default:System.out.println("Invalid number, enter again");
				operation();
				break;
		}
	}

}
