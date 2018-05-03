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

public class OrderedLinkedList <T>{
	
	 Node HEAD;	
	/**static add function to add a data inside a list
	 * @param data the data wants to add in a list
	 */
	public <T extends Comparable<T>> void add(T data)
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

	/**static add function to add a data inside a list
	 * @param data the data wants to add in a list
	 */
	public  <T extends Comparable<T>> void addOrder(T data)
	{
	Node node=new Node();
	node.data=data;
	node.nextNode=null;
	Node insertTemp=null;
	if(HEAD==null)
		HEAD=node;
	else
	{
		Node temp=HEAD;
		while(temp.nextNode!=null)
	
		{	
			if(temp.data.compareTo(data)<0 && temp.nextNode.data.compareTo(data)>0)
			{
			insertTemp=node;
			insertTemp.nextNode=temp.nextNode;
			temp.nextNode=insertTemp;
			break;
			}
			temp=temp.nextNode;
		}
		temp.nextNode=node;
	}
	}
/**static search funtion is to search the given word.
 * @param word the word which has to be search.
 * @return integer which is position of the word.
 */
public  <T extends Comparable<T>> boolean search(T word)
{
		Node temp=HEAD;
		int i=0;
		while(temp!=null)
		{
			if(temp.data.equals(word))
			{
				return true;
			}
			temp=temp.nextNode;
				i++;
		}
	
	return false;
}

/**static remove funtion is to remove the word in given position.
 * @param position the word which has to be remove.
 */
@SuppressWarnings("unchecked")
public <T extends Comparable<T>> void remove(int position)
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
/*	
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
	}	*/
		
}
public <T extends Comparable<T>> void delete(T key)
{
	Node temp1=null;
	if(HEAD==null)
		System.out.println("Empty");
	else if(HEAD.data.compareTo(key)==0)
	{
		temp1=HEAD;
		HEAD=HEAD.nextNode;
		temp1=null;
	}else 
	{
		Node prev=null;
		Node temp2=HEAD;
		while(temp2!=null)
		{
			if(temp2.data.compareTo(key)==0)
			{
				prev.nextNode=temp2.nextNode;
				temp2=null;
				break;
			}
			else
			{
				prev=temp2;
				temp2=temp2.nextNode;
			}
			
		}
		
	}
}
/**static function show to display the list.
 * 
 */
public <T extends Comparable<T>> void show()
	{
		Node node=HEAD;
		if(HEAD==null)
		{
			System.out.println("empty");
		}
		else if(HEAD.nextNode==null)
		{
			System.out.println(node.data);
		}
		else
		{	while(node!=null)
			{
				System.out.println(node.data);
				node=node.nextNode;
			}
		}
	}
/**static operation function of unordered list.
 * @param word	is string to search in file.
 * @param stringArray is strings in a file.
 * @throws IOException is a class of Exception that was raised due to all Input/Output contingencies.
 */
	public void operation(String number,String []sortArray) throws IOException
	{
	//	OrderedList list=new OrderedList();
		for(int i=0;i<sortArray.length;i++)
		{
			add(sortArray[i]);
		}
		
		boolean flag=search(number);
		if(flag==false)
			addOrder(number);
		else
			delete(number);
		
		show();
		File file=new File("/home/bridgeit/zeeshan/Files/OrderedList.txt");
		Node node=HEAD;
		while(node.nextNode!=null)
		{
			Utility.printwrite(file,node.data);
			node=node.nextNode;
		}
		
		Utility.printwrite(file,node.data);
	}

}
