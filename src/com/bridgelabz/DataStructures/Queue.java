/******************************************************************************
 *  Purpose:	Implementetaion of queue
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   27-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.DataStructures;

public class Queue {
	Object queueArray[];
	int size,rare,front,stackLength;
	static int BANKCASH;
	public Queue(int queueLength,int bankCash)
	{
		BANKCASH=bankCash;
		size=queueLength;
		queueArray=new Object[size];
		rare=-1;
		front=0;
	}
	public <T extends Comparable <T>> void enqueue(T element)
	{
		if(rare==size-1)
			System.out.println("Queue was full, insertion not possible");
		else
			queueArray[++rare]=element;
	}
	public <T extends Comparable <T>> void dequeue()
	{
		if(rare==-1||front>rare)
			System.out.println("Queue was empty, deletion not possible");
		else
			front++;
	}
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
	public <T extends Comparable <T>> void counter(String choice)
	{
	//	if(choice=="deposit")
		//	BANKCASH=BANKCASH+queueArray[rare-1];
	}

}
