/******************************************************************************
 *  Purpose:	Queue using linkeed list.
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   02-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

public class QueueLinkedlist <T>{
	static Node HEAD;
	static int SIZE=0;
	/**static add function to add a data at end of list.
	 * @param data the data wants to add in a list.
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
	/**static remove funtion is to remove the data in front of list.
	 * @param position the data which has to be remove.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void remove()
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
	/**static function show to display the list.
	 * 
	 */
	public static <T extends Comparable<T>> void show()
		{
			Node node=HEAD;
			while(node.nextNode!=null)
			{
				System.out.print(node.data+" ");
				node=node.nextNode;
			}
			System.out.print(node.data+" ");
		}

}
