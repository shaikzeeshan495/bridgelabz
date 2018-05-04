/******************************************************************************
 *  Purpose:	Unordered Linked List
 *
 *  @author  Zeeshan
 *  @version 1.0
 *  @since   23-04-2018
 *
 ******************************************************************************/
package com.bridgelabz.DataStructures;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UnorderedList <T>{
	 public static	 Node HEAD;
	
		/**static add function to add a data inside a list
		 * @param data the data wants to add in a list
		 */
	public  <T extends Comparable<T>> void add(T data)
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
	
	/**static search funtion is to search the given word.System.out.println(node.data);
	 * @param word the word which has to be search.
	 * @return boolean status of search function.
	 */
	public  <T extends Comparable<T>> boolean search(T word)
	{
			Node temp=HEAD;
			
			while(temp!=null)
			{
				if(temp.data.compareTo(word)==0)
				{
					return true;
				}
				temp=temp.nextNode;
					
			}
		
		return false;
	}
	
	/**delete function is to delete a data in list.
	 * @param key is data to delete
	 */
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
	public  <T extends Comparable<T>> void display()
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
	public void operation(String word,String stringArray[]) throws IOException
	{
		UnorderedList list=new UnorderedList();
			for(int i=0;i<stringArray.length;i++)
			{
				list.add(stringArray[i]);
			}
			
			boolean flag=search(word);
			if(flag==false)
				list.add(word);
			else
				list.delete(word);
			
			list.display();
			File file=new File("/home/bridgeit/zeeshan/Files/UnorderedList.txt");
			FileWriter fw = new FileWriter(file);
		  	  BufferedWriter bw = new BufferedWriter(fw);
		  	  PrintWriter pw = new PrintWriter(bw);
		  	Node node=HEAD;
			if(HEAD==null)
			{
				System.out.println("empty");
			}
			else if(HEAD.nextNode==null)
			{
				pw.print(node.data+" ");
			}
			else
			{	while(node!=null)
				{
				pw.print(node.data+" ");
					node=node.nextNode;
				}
			}
		  	  pw.close();
			
		}
			
}
