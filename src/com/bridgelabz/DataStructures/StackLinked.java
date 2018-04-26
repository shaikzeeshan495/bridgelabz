package com.bridgelabz.DataStructures;

public class StackLinked {	
	static Node HEAD;
	public static int SIZE;
	
	/**static add function to add a data inside a list
	 * @param data the data wants to add in a list
	 */
	public static <T extends Comparable<T>> void add(T data)
	{
		Node node=new Node();
		node.data=data;
		node.nextNode=null;
		if(HEAD==null)
			HEAD=node;
		else
		{
			Node temp=HEAD;
			while(temp.nextNode!=null)
			{
				temp=temp.nextNode;
			}
			temp.nextNode=node;
		}
}

/**static search funtion is to search the given word.
 * @param word the word which has to be search.
 * @return integer which is position of the word.
 */
public static <T extends Comparable<T>> int search(T word)
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
public static <T extends Comparable<T>> void pop()
{
		Node temp1=null;
		Node temp=HEAD;
		while(temp.nextNode.nextNode!=null)
		{
			temp=temp.nextNode;
		}
		temp.nextNode=null;
}
	
/**static function show to display the list.
 * 
 */
public  <T extends Comparable<T>> void display()
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
	public  <T extends Comparable<T>> String isEmpty()
	{
		if(HEAD==null)
			return "Stack is empty";
		else
			return "Stack is not empty";
	}
	
	public  <T extends Comparable<T>> void operation()
	{
		
	}
}
