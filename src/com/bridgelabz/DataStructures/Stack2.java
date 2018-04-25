package com.bridgelabz.DataStructures;

import java.util.Arrays;

public class Stack2 <T extends Comparable <T>>{
	static	int TOP=-1;
	static	int SIZE=10;
	  //static String []STACK=new String[SIZE];
	 Object[] STACK=new Object[SIZE];
	public  <T extends Comparable<T>> void push(T data)
	{
		
		if(TOP==SIZE-1)
				System.out.println("Stack is full");
			else
			{	
				TOP++;
			//	System.out.println(TOP);
				STACK[TOP]=data;
			//	System.out.println(STACK[TOP]);	
			}
	}
	
	public  <T extends Comparable<T>> void pop()
	{
			if(TOP==-1)
				System.out.println("Stack is empty");
			else
			{
				TOP--;
			}
	}	
	
	public  <T extends Comparable<T>> void display()
	{
		if(TOP==-1)
			System.out.println("Stack is empty");
		else
		{
		//	System.out.println(Arrays.toString(STACK));
			for(int i=0;i<=TOP;i++)
			{
				System.out.print(STACK[i]+" ");
			}
		}
	}

}
