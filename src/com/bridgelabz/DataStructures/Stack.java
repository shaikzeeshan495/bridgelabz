/******************************************************************************
 *  Purpose:	Implementetaion of stack
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   26-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

public class Stack <T extends Comparable <T>>{
	Object stackArray[];
	int size,top;

	/**Stack function is to initialize the stack length.
	 * @param arrayLength it is length of input.
	 */
	public Stack(int arrayLength)
	{
		size = arrayLength;
        stackArray = new Object[size];
        top = -1;
	}

	/**push function is to push the data in stack.
	 * @param data is input data to push in stack
	 */
	public  <T extends Comparable<T>> void push(T data)
	{
	
		if(top==size-1)
				System.out.println("Stack is full");
			else
			{	
				top++;
				stackArray[top]=data;
			}
	}
	
	/**Static function pop is to delete data from stack.
	 * 
	 */
	public  <T extends Comparable<T>> void pop()
	{
			if(top==-1)
				System.out.println("Stack is empty");
			else
			{
				top--;
			}
	}	
	
	/**static function display is to display elements inside a stack.
	 * 
	 */
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
	
	/**isEmpty function is to check the stack weather it is empty or full.
	 * @return boolean true if it is empty otherwise false.
	 */
	public  <T extends Comparable<T>> boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
		
	}

}
