/******************************************************************************
 *  Purpose:	Unordered Linked List
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   23-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;

import java.io.File;
import java.io.IOException;
import com.bridgelabz.utility.Utility;

public class OrderedList <T>{
	
	static Node HEAD;	
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
@SuppressWarnings("unchecked")
public static <T extends Comparable<T>> void remove(int position)
{
	if(position==0)
	{
		HEAD=HEAD.nextNode;
	}
	else
	{
		Node n=HEAD;
		Node temp=null;
		for(int i=0;i<position-1;i++)
		{
			n=n.nextNode;
		}
		temp=n.nextNode;
		n.nextNode=temp.nextNode;
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
			System.out.println(node.data);
			node=node.nextNode;
		}
		System.out.println(node.data);
	}
/**static operation function of unordered list.
 * @param word	is string to search in file.
 * @param stringArray is strings in a file.
 * @throws IOException is a class of Exception that was raised due to all Input/Output contingencies.
 */
	public static void operation(String number,String []sortArray) throws IOException
	{
	//	OrderedList list=new OrderedList();
		for(int i=0;i<sortArray.length;i++)
		{
			add(sortArray[i]);
		}
		
		int position=search(number);
		if(position==-1)
			add(number);
		else
			remove(position);
		
		show();
		File file=new File("/home/bridgeit/zeeshan/Files/OrderedListOut.txt");
		Node node=HEAD;
		while(node.nextNode!=null)
		{
			Utility.printwrite(file,node.data);
			node=node.nextNode;
		}
		
		Utility.printwrite(file,node.data);
	}

}
