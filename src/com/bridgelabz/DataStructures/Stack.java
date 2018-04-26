package com.bridgelabz.DataStructures;

public class Stack <T extends Comparable <T>>{
/*	static	int TOP=-1;
	static	int SIZE;
	  //static String []STACK=new String[SIZE];
static	 Object[] STACK;
	//=new Object[SIZE];	*/
	Object stackArray[];
	int size,top,stackLength;

	public Stack(int arrayLength)
	{
		size = arrayLength;
        stackLength = 0;
        stackArray = new Object[size];
        top = -1;
	}

	public  <T extends Comparable<T>> void push(T data)
	{
	
		if(top==size-1)
				System.out.println("Stack is full");
			else
			{	
				top++;
			//	System.out.println(TOP);
				stackArray[top]=data;
			//	System.out.println(STACK[TOP]);	
			}
	}
	
	public  <T extends Comparable<T>> void pop()
	{
			if(top==-1)
				System.out.println("Stack is empty");
			else
			{
				top--;
			}
	}	
	
	public  <T extends Comparable<T>> void display()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(stackArray[i]+" ");
			}
		}
	}
	public  <T extends Comparable<T>> boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
		
	}

}
