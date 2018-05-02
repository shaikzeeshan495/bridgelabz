/******************************************************************************
 *  Purpose:	Dequeue
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   30-04-2018
 *
 ******************************************************************************/

package com.bridgelabz.DataStructures;

public class Dequeue <T>{
	static Node HEAD;	
	/**static add function to add a data at end of list.
	 * @param data the data wants to add in a list.
	 */
	public static <T extends Comparable<T>> void addRear(T data)
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
	/**static add function to add a data at front of list.
	 * @param data the data wants to add in a list.
	 */
	public static <T extends Comparable<T>> void addFront(T data)
	{
		Node node=new Node();
		node.data=data;
		node.nextNode=null;
		if(HEAD==null)
			HEAD=node;
		else
		{
			Node temp=node;
			temp.nextNode=HEAD;
			HEAD=temp;
		}
	}
	/**static remove funtion is to remove the data in end of list.
	 * @param position the data which has to be remove.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void removeRear()
	{
		if(HEAD==null)
			System.out.println("Empty");
		else if(HEAD.nextNode==null)
		{
			HEAD=null;
		}else
		{
			Node temp=HEAD;
			while(temp.nextNode.nextNode!=null)
			{
				temp=temp.nextNode;
			}
			temp.nextNode=null;
		}
			
	}
	
	/**static remove funtion is to remove the data in front of list.
	 * @param position the data which has to be remove.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void removeFront()
	{
		if(HEAD==null)
			System.out.println("Empty");
		else
		{
			Node temp=HEAD;
			HEAD=HEAD.nextNode;
			temp=null;
		}
			
	}
	
	/**static remove funtion is to remove the data in end of list.
	 * @param position the data which has to be remove.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> T popRear()
	{
		Node temp=HEAD;
		Node result=null;
		if(HEAD==null)
			System.out.println("Empty list");
		else if(HEAD.nextNode==null)
		{
			result=HEAD;
		}else
		{
			
			while(temp.nextNode.nextNode!=null)
			{
				temp=temp.nextNode;
			}
			result=temp.nextNode;
			temp.nextNode=null;
		}
		return (T) result.data;
	}
	
	/**static remove funtion is to remove the data in front of list.
	 * @param position the data which has to be remove.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> T popFront()
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
		}

		return (T) result2.data;
	}
	/**static function show to display the list.
	 * 
	 */
	public static <T extends Comparable<T>> void operation()
		{
		if(HEAD.nextNode==null || HEAD==null)
		{
			System.out.println("palindrome");
			System.exit(0);
		}
			T elem=popFront();
			T elem2=popRear();
			if(elem.compareTo(elem2)==0)
			{
				operation();
				
			}
			else 
				System.out.println("It is not a Palindrome");
			
		}
	/**static function show to display the list.
	 * 
	 */
	public static <T extends Comparable<T>> void show()
		{
			Node node=HEAD;
			while(node.nextNode!=null)
			{
				System.out.println(node.data);
				node=node.nextNode;
			}
			System.out.println(node.data);
		}

}