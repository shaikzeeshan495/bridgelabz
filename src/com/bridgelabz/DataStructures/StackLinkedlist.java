package com.bridgelabz.DataStructures;

public class StackLinkedlist {	
	static Node HEAD;
	public static int SIZE=0;
	
	/**static add function to add a data at front of list.
	 * @param data the data wants to add in a list.
	 */
	public  <T extends Comparable<T>> void push(T data)
	{
		Node node=new Node();
		node.data=data;
		node.nextNode=null;
		if(HEAD==null)
		{
			HEAD=node;
			SIZE++;
		}
		else
		{
			Node temp=node;
			temp.nextNode=HEAD;
			HEAD=temp;
			SIZE++;
		}
	}


/**static search funtion is to search the given word.
 * @param word the word which has to be search.
 * @return integer which is position of the word.
 */
public  <T extends Comparable<T>> int search(T word)
{
		Node temp=HEAD;
		int i=0;
		while(temp!=null)
		{
			if(temp.data.equals(word))
			{
				return i;
			}
			temp=temp.nextNode;
				i++;
		}
	
	return -1;
}

/**static remove funtion is to remove the word in given position.
 * @param position the word which has to be remove.
 */
/*
public static <T extends Comparable<T>> void pop()
{
		Node temp1=null;
		Node temp=HEAD;
		while(temp.nextNode.nextNode!=null)
		{
			temp=temp.nextNode;
		}
		temp.nextNode=null;
}	*/
/**static remove funtion is to remove the data in front of list.
 * @param position the data which has to be remove.
 */
@SuppressWarnings("unchecked")
public  <T extends Comparable<T>> T pop()
{
	Node temp=HEAD;
	Node result2=null;
	if(HEAD==null)
		System.out.println("Empty");
	else
	{
		HEAD=temp.nextNode;
		result2=temp;
		temp=null;
		SIZE--;
	}
	
	return (T) result2.data;
}
/**static function show to display the list.
 * 
 */
public <T extends Comparable<T>> void display()
	{
		Node node=HEAD;
		while(node.nextNode!=null)
		{
			System.out.print(node.data+" ");
			node=node.nextNode;
		}
		System.out.print(node.data+" ");
	}
	/**isEmpty function is to give a status of stack.
	 * @return string status of stack either stack is empty or full.
	 */
	public  <T extends Comparable<T>> boolean isEmpty()
	{
		if(HEAD==null)
			return true;
		else
			return false;
	}
	
	/**isEmpty function is to give a status of stack.
	 * @return string status of stack either stack is empty or full.
	 */
	public  int size()
	{
		return SIZE;
	}
	
}
